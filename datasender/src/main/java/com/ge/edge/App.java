package com.ge.edge;

import org.springframework.web.bind.annotation.RequestMapping;

import com.ge.edge.connector.KafkaProducer;

//@RestController
//@EnableAutoConfiguration
public class App {

    @RequestMapping("/")
    String home() {

        return "Hello World!";
    }

    public static void main(String[] args) throws Exception {

        KafkaProducer.runProducer(5);
        KafkaProducer.runAsyncProducer(5);
        //SpringApplication.run(App.class, args);
    }
}