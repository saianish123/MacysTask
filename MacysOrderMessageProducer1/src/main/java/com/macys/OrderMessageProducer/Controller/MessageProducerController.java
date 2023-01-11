package com.macys.OrderMessageProducer.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.macys.OrderMessageProducer.Service.MessageProducerService;
import com.macys.OrderMessageProducer.entity.MessageProducer;

import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/Item")
@Slf4j
public class MessageProducerController {

	@Autowired
	private MessageProducerService messageProducerService;
	
	@PostMapping("/")
	public MessageProducer saveMessageProducer(@RequestBody MessageProducer messageproducer) {
		
		return  messageProducerService.saveMessageProducer(messageproducer);
		
	}
	//@GetMapping("/{id}")
	//public MessageProducer findMessageProducerbyId(@PathVariable long itemID) {
		//return messageProducerService.findMessageProducerbyId(itemID);
		
	//}
}
