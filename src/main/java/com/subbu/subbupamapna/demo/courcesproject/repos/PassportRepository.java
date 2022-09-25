package com.subbu.subbupamapna.demo.courcesproject.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subbu.subbupamapna.demo.courcesproject.Course;
import com.subbu.subbupamapna.demo.courcesproject.Passport;



@Repository
@Transactional
public class PassportRepository {
	
	
	@Autowired
	EntityManager entityManager;
	
	
	
	public Passport findByID(Long id) {
		Passport passport=(Passport)entityManager.find(Passport.class ,id);
		return passport;
	}
	
	public Passport insert(Passport passport) {
		/*Pass Course to insert/update*/
		return entityManager.merge(passport);
	}
	
    public void deleteByID(Long id) {
    	
    	/*Before deleting the Passport ,we need to fetch the Passport*/
    	Passport passport=findByID(id);
		entityManager.remove(passport);
		  
	}
    
 
  	
}
