package com.subbu.subbupamapna.demo.jpainheritancemapping;

import java.util.List;

import javax.persistence.EntityManager;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.subbu.subbupamapna.demo.courcesproject.Course;

@Repository
@Transactional
public class EmployeeRepo {
	
	
	@Autowired
	EntityManager em;
	
	
	public void insert(Employee employee) {
		 em.persist(employee); 
		 
	}
	
	
	public List<Employee> getAll(){
		
		return (List<Employee>) em.createQuery("Select e from Employee e",Employee.class).getResultList();
	}


	public Employee findByID(Long id) {
		Employee course=(Employee)em.find(Employee.class ,id);
		return course;
	}
	
	
	
}
