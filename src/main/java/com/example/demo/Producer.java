package com.example.demo;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.StreamsConfig;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.internals.KStreamTransformValues;

import java.util.Properties;

public class Producer {

//    final Properties streamsConfiguration = new Properties();
//    final String bootstrapServers = "localhost:9092";
//    // Give the Streams application a unique name.  The name must be unique in the Kafka cluster
//    // against which the application is run.
//    Producer(){
//        streamsConfiguration.put(StreamsConfig.APPLICATION_ID_CONFIG, "env-setup-example");
//        streamsConfiguration.put(StreamsConfig.CLIENT_ID_CONFIG, "env-setup-example-client");
//        // Where to find Kafka broker(s).
//        streamsConfiguration.put(StreamsConfig.BOOTSTRAP_SERVERS_CONFIG, bootstrapServers);
//        // Specify default (de)serializers for record keys and for record values.
//        streamsConfiguration.put(StreamsConfig.DEFAULT_KEY_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
//        streamsConfiguration.put(StreamsConfig.DEFAULT_VALUE_SERDE_CLASS_CONFIG, Serdes.String().getClass().getName());
//        // Records should be flushed every 10 seconds. This is less than the default
//        // in order to keep this example interactive.
//        streamsConfiguration.put(StreamsConfig.COMMIT_INTERVAL_MS_CONFIG, 10 * 1000);
//        // For illustrative purposes we disable record caches
//        streamsConfiguration.put(StreamsConfig.CACHE_MAX_BYTES_BUFFERING_CONFIG, 0);
//    }
//
//    public void sendData(String data){
//        StreamsBuilder streamsBuilder = new StreamsBuilder();
//
//        final KStream<String, String> stream = streamsBuilder.stream("test");
//        //stream.to("test", );
//    }

}
