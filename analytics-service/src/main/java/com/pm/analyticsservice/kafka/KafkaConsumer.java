package com.pm.analyticsservice.kafka;

@Service
public class KafkaConsumer {

    @KafkaListener(topic="patient", groupId = "analytics-service")
    public void consumeEvent(byte[] event) {
        //5"44"44
    }
}
