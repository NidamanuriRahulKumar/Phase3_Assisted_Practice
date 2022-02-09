package com.ecommerce;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;


@SpringBootApplication
public class SpringBootKafkaApplication {

        @Autowired
           private KafkaTemplate<String, String> kafkaTemplate;

        public static void main(String[] args) {
                SpringApplication.run(SpringBootKafkaApplication.class, args);
                
        }
        

        
           @KafkaListener(topics = "ecommerce", groupId = "group-id")
           public void listen(String message) {
              System.out.println("Received Message in group - group-id: " + message);
           }
          
}
