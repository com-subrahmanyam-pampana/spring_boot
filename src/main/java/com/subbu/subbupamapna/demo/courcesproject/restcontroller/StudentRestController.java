package com.subbu.subbupamapna.demo.courcesproject.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.subbu.subbupamapna.demo.courcesproject.Student;
import com.subbu.subbupamapna.demo.courcesproject.repos.StudentRepository;





@RestController
public class StudentRestController {
	
	@Autowired
	StudentRepository passportRepository;
	
	
	@GetMapping("student/id")
	public Student getCourse(@RequestParam("id") Long id ) {
		return passportRepository.findByID(id);
	}
	

	@PostMapping("student/add")
	public Student addCourse(@RequestBody Student passport  ) {
		return passportRepository.insert(passport);
	}
	
		
}