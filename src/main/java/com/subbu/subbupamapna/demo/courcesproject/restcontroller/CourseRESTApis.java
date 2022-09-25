package com.subbu.subbupamapna.demo.courcesproject.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.subbupamapna.demo.courcesproject.Course;
import com.subbu.subbupamapna.demo.courcesproject.repos.CourceRepository;

@RestController
public class CourseRESTApis {
	
	@Autowired
	CourceRepository courceRepository;
	
	
	@GetMapping("course/id")
	public Course getCourse(@RequestParam("id") Long id ) {
		return courceRepository.findByCourseID(id);
	}
	
	
	@PostMapping("course/add")
	public Course addCourse(@RequestBody Course course  ) {
		return courceRepository.insert(course);
	}
	
	
	@GetMapping("course/jpql")
	public Object jPQLTest(@RequestParam("id") int caseNumber) {
		return courceRepository.jPQLTest(caseNumber);
		
	}
	
	
}
