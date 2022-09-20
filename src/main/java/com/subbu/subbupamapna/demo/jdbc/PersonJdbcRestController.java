package com.subbu.subbupamapna.demo.jdbc;

import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.subbu.subbupamapna.demo.resrexamples.a_simple.Employee;
import com.subbu.subbupamapna.demo.resrexamples.b_restanddb.Student;

@RestController
public class PersonJdbcRestController {
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	@Autowired
	PersonJDBCDAO  personJDBCDAO;
	
	@GetMapping("jdbc/list")
	public List<Person> getStudents() {
		/*Even thought we didnt serialized this,this will return JSON.This is done by Auto Configurarion */
		
		List<Person> personList=personJDBCDAO.findAll();
		
		return personList;
	}
	
	
	@GetMapping("jdbc/id")
	public Person findByID(@RequestParam("id") int id) {
	
		
		Person person=personJDBCDAO.findByID(id);
		
		return person;
	}
	
	
	@GetMapping("jdbc/delete")
	public int deleteByID(@RequestParam("id") int id) {
		
		
		int idDeleted=personJDBCDAO.deleteByID(id);
		
		return idDeleted;
	}
	
	
	
	
	@PostMapping("jdbc/insert")
	public void insert(@RequestBody Person person) {
		
		
		personJDBCDAO.insert(person);
		
	}
	
	
	@PostMapping("jdbc/update")
	public void updateName(@RequestBody Person person) {
		
		
		personJDBCDAO.updateName(person);
		
	}
	
	
	
	
	
	
	
	
	

	
	
	

}
