package com.subbu.subbupamapna.demo.courcesproject;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subbu.subbupamapna.demo.jpaexamples.Teacher;


@Repository
public class CourceRepository {
	
	
	@Autowired
	EntityManager em;
	
	
	
	public Course findByCourseID(long id) {
		Course course=(Course )em.find(Course.class ,id);
		return course;
	}
	
    public void deleteByID(int Id) {
		  new Course();
	}
    
   
	public Course save(Course cource) {	
		return  new Course();
	}
    
	
}
