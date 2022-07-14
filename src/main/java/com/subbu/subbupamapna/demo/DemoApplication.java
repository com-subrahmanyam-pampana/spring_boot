package com.subbu.subbupamapna.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.subbu.subbupamapna.demo.repositoryexample.Student;
import com.subbu.subbupamapna.demo.repositoryexample.StudentRepository;
import com.subbu.subbupamapna.demo.springconfigsalarm.Door;

@SpringBootApplication
public class DemoApplication {
	
	
	public static void demoRepository() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("com.subbu.subbupamapna.demo.repositoryexample");
        context.refresh();
		
		StudentRepository repository = context.getBean(StudentRepository.class);
        // testing the store method
        repository.save(new Student(1L, "Anshul", 25));
        repository.save(new Student(2L, "Mayank", 23));
        // testing the retrieve method
        Student student = repository.findStudentById(1L);
        System.out.println(student);
        // close the spring context
        context.close();
	}
	
	public static  void alarmExampleTest() {
		ApplicationContext context=new FileSystemXmlApplicationContext("classpath:alarmbeans.xml");
		Door door=context.getBean("doorBeanWithSoundAlarm",Door.class);
		door.open();
		door.close();
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		//alarmExampleTest();
		demoRepository();
	}

}
