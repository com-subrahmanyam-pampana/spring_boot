package com.subbu.subbupamapna.demo.resrexamples.b_restanddb;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.subbupamapna.demo.jdbc.PersonJDBCDAO;

@RestController("")
public class RestController2 {
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	
	@GetMapping("test2/")
	public String test2() {
		return  "Test2";
	}
	
	
	@GetMapping("test2/students")
	public List<Student> getStudents() {
		/*Even thought we didn't serialized this,this will return JSON.This is done by Auto Configuration */
		return Arrays.asList(new Student(1,"Subbu"));
	}
	
	

}
