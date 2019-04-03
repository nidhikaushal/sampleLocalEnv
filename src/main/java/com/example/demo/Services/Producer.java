package com.example.demo.Services;

import com.athenahealth.Measure;
import com.athenahealth.
import org.apache.avro.specific.SpecificRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class Producer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);
    private final static String TOPIC = "users";
    private static long count = 1;

    @Autowired
    private KafkaTemplate<String, Measure> kafkaTemplate;

    public void sendMessage(String message) {
        logger.info(String.format("#### -> Produced message -> %s", message));

        Measure measure = Measure.newBuilder()
                .setTest(message)
                .setId(count++)
                .build();

        this.kafkaTemplate.send(TOPIC, measure);
    }
}
