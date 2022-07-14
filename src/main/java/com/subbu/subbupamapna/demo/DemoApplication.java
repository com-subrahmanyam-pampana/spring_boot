package com.subbu.subbupamapna.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import com.subbu.subbupamapna.demo.jpaexamples.entity.UserEntity;
import com.subbu.subbupamapna.demo.repositoryexample.Student;
import com.subbu.subbupamapna.demo.repositoryexample.StudentRepository;


@SpringBootApplication
public class DemoApplication {
	
	
	
	public static void userEntity() {
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("user_details");  
	     EntityManager em=emf.createEntityManager();       
	     em.getTransaction().begin();  
	          
	      UserEntity s1=new UserEntity();  
	       s1.setUserId(1);
           s1.setEmail("user1@gmail.com");
           s1.setPhone("9123456789");
           UserEntity s2=new UserEntity();  
	       s1.setUserId(2);
           s1.setEmail("user2@gmail.com");
           s1.setPhone("8123456789");	       
	          
	      
	        em.persist(s1);  
	        em.persist(s2);  
	           
	        em.getTransaction().commit();  
	          
	        emf.close();  
	        em.close();  
	}
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
	
	

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
		
		//demoRepository();
		userEntity();
	}

}
