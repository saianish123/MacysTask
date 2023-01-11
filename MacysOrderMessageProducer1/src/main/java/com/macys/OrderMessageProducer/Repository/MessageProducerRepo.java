package com.macys.OrderMessageProducer.Repository;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.macys.OrderMessageProducer.entity.MessageProducer;

@Repository
public interface  MessageProducerRepo extends JpaRepository<MessageProducer , Long>{

	MessageProducer findMessageProducerbyId(long itemID);

}


