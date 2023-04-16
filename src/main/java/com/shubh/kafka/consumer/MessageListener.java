package com.shubh.kafka.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

import com.shubh.kafka.constants.KafkaConstants;
import com.shubh.kafka.model.Message;

@Component
public class MessageListener {
	

	@Autowired
    SimpMessagingTemplate template;

    @KafkaListener(
            topics = KafkaConstants.KAFKA_TOPIC,
            groupId = KafkaConstants.GROUP_ID
    )
    public void listen(Message message) {
        //System.out.println("sending via kafka listener..");
        template.convertAndSend("/topic/group", message);
    }
}
