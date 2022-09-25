package com.subbu.subbupamapna.demo.courcesproject.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.subbupamapna.demo.courcesproject.Course;
import com.subbu.subbupamapna.demo.courcesproject.Passport;
import com.subbu.subbupamapna.demo.courcesproject.repos.CourceRepository;
import com.subbu.subbupamapna.demo.courcesproject.repos.PassportRepository;


@RestController
public class PassportRESTController {
	
	@Autowired
	PassportRepository passportRepository;
	
	
	@GetMapping("passport/id")
	public Passport getCourse(@RequestParam("id") Long id ) {
		return passportRepository.findByID(id);
	}
	

	@PostMapping("passport/add")
	public Passport addCourse(@RequestBody Passport passport  ) {
		return passportRepository.insert(passport);
	}
	
	
	
	
}