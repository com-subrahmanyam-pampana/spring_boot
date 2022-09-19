package com.subbu.subbupamapna.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.subbu.subbupamapna.demo.jdbc.PersonJDBCDAO;

@SpringBootApplication

public class DemoApplication implements CommandLineRunner {
	
	
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	PersonJDBCDAO  personJDBCDAO;
	
	
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		System.out.println("Spring Bott Main Application started");
	}

	@Override
	public void run(String... args) throws Exception {
		
		logger.info("All users->{}",personJDBCDAO.findAll());
		
	
	}

}
