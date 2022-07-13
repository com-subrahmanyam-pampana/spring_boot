package com.subbu.subbupamapna.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.subbu.subbupamapna.demo.springconfigsalarm.Door;

@SpringBootApplication
public class DemoApplication {
	
	
	
	
	public static  void alarmExampleTest() {
		ApplicationContext context=new FileSystemXmlApplicationContext("classpath:alarmbeans.xml");
		Door door=context.getBean("doorBeanWithSoundAlarm",Door.class);
		door.open();
		door.close();
		
		
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		alarmExampleTest();
	}

}
