package com.ge.edge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;

import com.ge.edge.consumer.KafkaMessageConsumer;

@EnableAutoConfiguration
public class App {

    public static void main(String[] args) throws InterruptedException {

        SpringApplication.run(App.class, args);

        System.out.println("Hello World!");

        KafkaMessageConsumer.runConsumer();
    }
}
