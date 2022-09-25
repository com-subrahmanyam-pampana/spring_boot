package com.subbu.subbupamapna.demo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.subbu.subbupamapna.demo.courcesproject.Course;
import com.subbu.subbupamapna.demo.courcesproject.repos.CourceRepository;



@RunWith(SpringRunner.class)
@SpringBootTest(classes=DemoApplication.class)
//This will launch entire application context
class DemoApplicationTests {
	
	@Autowired
	CourceRepository courceRepository;

	@Test
	void findTheCourse() {
		
		Course course=(Course)courceRepository.findByCourseID(new Long(1));
		
		assertEquals("DB",course.getName());
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<Testing is running>>>>>>>>");
	}
	
	@Test
	@DirtiesContext
	//This @DirtiesContext annotation will revert the deleted data so that other Unit test methods can use
	void deleteTheCourse() {
		
	     courceRepository.deleteByID(new Long(1));
	     assertNull(courceRepository.findByCourseID(new Long(1)));
		
	}

}
