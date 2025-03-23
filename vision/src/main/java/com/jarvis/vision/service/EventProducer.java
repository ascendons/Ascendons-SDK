package com.jarvis.vision.service;

import com.jarvis.vision.dto.EventRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class EventProducer implements Serializable {

    private static final String TOPIC = "test-topic";

    @Autowired
    private KafkaTemplate<String, String> kafkaTemplate;

    public void sendEvent(String eventId, EventRequest message) {
        kafkaTemplate.send(TOPIC, eventId, message.toString());
    }
}