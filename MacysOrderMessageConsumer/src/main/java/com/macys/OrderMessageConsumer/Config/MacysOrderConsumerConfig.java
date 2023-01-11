package com.macys.OrderMessageConsumer.Config;

import java.util.HashMap;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.core.launch.support.RunIdIncrementer;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.xml.StaxEventItemReader;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;
import org.springframework.oxm.xstream.XStreamMarshaller;

import org.springframework.batch.core.job.builder.JobBuilder;

import com.macys.OrderMessageConsumer.Model.macysOrderModel;
import com.macys.OrderMessageConsumer.Processor.macysOrderProcessor;

@Configuration
@EnableBatchProcessing
public class MacysOrderConsumerConfig {

	@Autowired
	private JobBuilderFactory jobBuilderFactory;

	@Autowired
	private StepBuilderFactory stepBuilderFactory;

	@Autowired
	private DataSource dataSource;

	@Bean
	public macysOrderProcessor processor() {
		return new macysOrderProcessor();

	}

	@Bean
	public StaxEventItemReader<macysOrderModel> reader() throws ClassNotFoundException {
		StaxEventItemReader<macysOrderModel> reader = new StaxEventItemReader<macysOrderModel>();
		reader.setResource(new ClassPathResource("macysorder.xml"));
		reader.setFragmentRootElementName("mOrder");

		Map<String, String> aliasesMap = new HashMap<String, String>();
		aliasesMap.put("mOrder", "com.macys.OrderMessageConsumer.Model.macysOrder");
		XStreamMarshaller marshaller = new XStreamMarshaller();
		marshaller.setAliases(aliasesMap);

		reader.setUnmarshaller(marshaller);
		return reader;
	}

	@Bean
	public JdbcBatchItemWriter<macysOrderModel> writer() {
		JdbcBatchItemWriter<macysOrderModel> writer = new JdbcBatchItemWriter<macysOrderModel>();
		writer.setDataSource(dataSource);
		writer.setSql(
				"INSERT INTO macysorder(orderID,orderTypeCode,partnerOrderID,orderStatus,messageCreateTimeStamp,fulfillmentChannelCode,orderStatusCode,orderStatusDescriptio,sellZLDivisionNbr,sellZLLocationNbr) VALUES(?,?,?,?,?,?,?,?,?,?)");
		writer.setItemPreparedStatementSetter(new MacysOrderSetter());
		return writer;
	}

	@Bean
	public Step step1() throws ClassNotFoundException {
		return stepBuilderFactory.get("step1").<macysOrderModel, macysOrderModel>chunk(300).reader(reader())
				.processor(processor()).writer(writer()).build();
	}

	@Bean
	public org.springframework.batch.core.Job exportMacysOrderJob() throws ClassNotFoundException {
		return jobBuilderFactory.get("importMacysOrderJob").incrementer(new RunIdIncrementer()).flow(step1()).end()
				.build();
	}
}
