package com.jarvis.vision.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EventConsumer {

    @KafkaListener(topics = "test-topic", groupId = "event-group")
    public void consumeEvent(String message) {
        System.out.println("Received Event: " + message);
        // Process the event
    }
}