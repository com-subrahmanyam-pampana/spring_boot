package com.subbu.subbupamapna.demo.courcesproject.repos;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subbu.subbupamapna.demo.courcesproject.Passport;
import com.subbu.subbupamapna.demo.courcesproject.Student;





@Repository
@Transactional
public class StudentRepository {
	
	
	@Autowired
	EntityManager entityManager;
	
	
	

	@Transactional
	public Student findByID(Long id) {
		Student passport=(Student)entityManager.find(Student.class ,id);
		return passport;
	}
	
	public Student insert(Student passport) {
		/*Pass Course to insert/update*/
		return entityManager.merge(passport);
	}
	
    public void deleteByID(Long id) {
    	
    	/*Before deleting the Passport ,we need to fetch the Passport*/
    	Student passport=findByID(id);
		entityManager.remove(passport);
		  
	}
    
 
  	
}