package com.example.demo.Services;

import com.athenahealth.schema.Measure;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;


import java.io.IOException;

@Service
public class Consumer {

    private final Logger logger = LoggerFactory.getLogger(Producer.class);

    @KafkaListener(topics = "users", groupId="group_id")
    public void consume(Measure measure) throws IOException {
        logger.info(String.format("#### -> Consumed message -> %s", measure.getTest()));
    }
}
