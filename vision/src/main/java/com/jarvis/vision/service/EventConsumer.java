package com.jarvis.vision.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class EventConsumer {

    @KafkaListener(topics = "my-topic", groupId = "event-consumer-group")
    public void consume(ConsumerRecord<String, String> record) {
        System.out.println("📩 Received Event: Key=" + record.key() + ", Value=" + record.value());
    }
}