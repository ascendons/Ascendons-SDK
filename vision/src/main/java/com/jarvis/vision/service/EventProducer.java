package com.jarvis.vision.service;

import com.jarvis.vision.dto.EventRequest;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.io.Serializable;

@Service
public class EventProducer implements Serializable {

    private static final String TOPIC = "my-topic";

    private final KafkaTemplate<String, String> kafkaTemplate;

    public EventProducer(KafkaTemplate<String, String> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void sendEvent(EventRequest event) {
        kafkaTemplate.send(TOPIC, event.getEventId(), event.getUserId());
    }
}