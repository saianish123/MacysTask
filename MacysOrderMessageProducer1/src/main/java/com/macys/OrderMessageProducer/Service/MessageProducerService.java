package com.macys.OrderMessageProducer.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.macys.OrderMessageProducer.Repository.MessageProducerRepo;
import com.macys.OrderMessageProducer.entity.MessageProducer;

@Service
public class MessageProducerService {
	
	@Autowired
private MessageProducerRepo messageProducerRepo;

	public MessageProducer saveMessageProducer(MessageProducer messageproducer) {
		return messageProducerRepo.save(messageproducer);
	}

//	public MessageProducer findMessageProducerbyId(long itemID) {
		
		//return messageProducerRepo.findMessageProducerbyId(itemID);
	//}
}
