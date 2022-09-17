package com.subbu.subbupamapna.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan({"com.subbu.subbupamapna.demo.jpaexamples"})
@EntityScan("com.subbu.subbupamapna.demo.jpaexamples")
@EnableJpaRepositories("com.subbu.subbupamapna.demo.jpaexamples")

public class DemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Spring Bott Main Application started");
	}

}
