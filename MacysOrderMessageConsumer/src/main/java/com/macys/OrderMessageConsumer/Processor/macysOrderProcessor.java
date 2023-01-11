package com.macys.OrderMessageConsumer.Processor;

import org.springframework.batch.item.ItemProcessor;

import com.macys.OrderMessageConsumer.Model.macysOrderModel;

public class macysOrderProcessor implements ItemProcessor<macysOrderModel, macysOrderModel> {

	public macysOrderModel process(macysOrderModel mOrder) throws Exception {
		return mOrder;
	}
}
