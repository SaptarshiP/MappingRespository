package com.psja.manytoone;

import org.springframework.context.annotation.PropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@PropertySource( value = "classpath:Message.properties" )
@EntityScan( "com.psja.manytoone.entity" )
public class ManytooneApplication {

	public static void main(String[] args) {
		SpringApplication.run(ManytooneApplication.class, args);
	}

}
