package com.subbu.subbupamapna.demo.courcesproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseRESTApis {
	
	@Autowired
	CourceRepository courceRepository;
	
	
	@GetMapping("course/get")
	public Course getCourse(@RequestParam("id") long id ) {
		return courceRepository.findByCourseID(id);
	}
	
	

}
