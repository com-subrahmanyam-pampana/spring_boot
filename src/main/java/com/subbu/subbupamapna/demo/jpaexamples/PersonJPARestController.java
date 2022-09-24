package com.subbu.subbupamapna.demo.jpaexamples;


import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class PersonJPARestController {
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	@Autowired
	TeacherJPARepo  teacherJPARepo;
	
//	@GetMapping("jdbc/list")
//	public List<Person> getStudents() {
//		/*Even thought we didnt serialized this,this will return JSON.This is done by Auto Configurarion */
//		
//		List<Person> personList=personJDBCDAO.findAll();
//		
//		return personList;
//	}
	
	
	@GetMapping("jpa/id")
	public Teacher findByID(@RequestParam("id") int id) {
		Teacher teacher=(Teacher )teacherJPARepo.findById(id);
		return teacher;
	}
	
	
	@PostMapping("jpa/update")
	public Teacher update(@RequestBody Teacher teacher) {
		return teacherJPARepo.update(teacher);
	}
	
	@PostMapping("jpa/insert")
	public Teacher insert(@RequestBody Teacher teacher) {
		return teacherJPARepo.update(teacher);
	}
	
	
	@PostMapping("jpa/delete")
	public void delete(@RequestParam("id") int id) {
		 teacherJPARepo.delete(id);
	}
	
	

	@GetMapping("jpa/all")
	public List<Teacher> finalAll() {
		 return teacherJPARepo.findAll();
	}
	
	
	
	
	
//	
//	@GetMapping("jdbc/delete")
//	public int deleteByID(@RequestParam("id") int id) {
//		
//		
//		int idDeleted=personJDBCDAO.deleteByID(id);
//		
//		return idDeleted;
//	}
//	
//	
//	
//	
//	@PostMapping("jdbc/insert")
//	public void insert(@RequestBody Person person) {
//		
//		
//		personJDBCDAO.insert(person);
//		
//	}
//	
//	
//	@PostMapping("jdbc/update")
//	public void updateName(@RequestBody Person person) {
//		
//		
//		personJDBCDAO.updateName(person);
//		
//	}
//	
	
	
	

}
