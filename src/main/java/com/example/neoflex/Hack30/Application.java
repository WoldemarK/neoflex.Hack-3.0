package com.example.neoflex.Hack30;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.cloud.openfeign.EnableFeignClients;
//import org.springframework.kafka.annotation.EnableKafka;

//@EnableKafka
//@EnableFeignClients
@SpringBootApplication
//@ConfigurationPropertiesScan
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
