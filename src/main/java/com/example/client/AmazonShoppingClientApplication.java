package com.example.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
public class AmazonShoppingClientApplication {

   public static void main(String[] args) {
      SpringApplication.run(AmazonShoppingClientApplication.class, args);
   }

   @LoadBalanced//for load balancing purpose
   @Bean
   public RestTemplate getTemplate() {
      return new RestTemplate();
   }

}
