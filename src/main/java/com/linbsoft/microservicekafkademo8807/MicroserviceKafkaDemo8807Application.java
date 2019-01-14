package com.linbsoft.microservicekafkademo8807;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MicroserviceKafkaDemo8807Application {

	 @Autowired
	    private KafkaSender kafkaSender;
	    @PostConstruct
	    public void init(){
	      for (int i = 0; i < 10; i++) {
	        //调用消息发送类中的消息发送方法
	        kafkaSender.send((long) i);
	      }
	    }
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceKafkaDemo8807Application.class, args);
	}
}

