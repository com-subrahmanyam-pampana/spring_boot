package com.subbu.subbupamapna.demo.courcesproject.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.subbu.subbupamapna.demo.courcesproject.Course;
import com.subbu.subbupamapna.demo.jpaexamples.Teacher;




@Repository
@Transactional
public class CourceRepository {
	
	
	@Autowired
	EntityManager entityManager;
	
	
	
	public Course findByCourseID(Long id) {
		Course course=(Course)entityManager.find(Course.class ,id);
		return course;
	}
	
	public Course insert(Course course) {
		/*Pass Course to insert/update*/
		return entityManager.merge(course);
	}
	
    public void deleteByID(Long id) {
    	
    	/*Before deleting the Course ,we need to fetch the Course*/
    	Course teacher=findByCourseID(id);
		entityManager.remove(teacher);
		  
	}
    
    
  public void persist() {
    	Course course=new Course("DBMS");
		entityManager.persist(course);
		
		
		course.setName("RDMS");
		/*Even though we are not using entityManager.merge  ,we can still update the  the cource to "RDMS" because of the 
		 * context */
		/*@Transactional will take care of this*/
		
		//You need to use clear() method of entity manager to clear the session
		entityManager.flush();
		entityManager.clear();
	}

  
  
public Object jPQLTest(int caseNumber) {
	
	switch(caseNumber) {
	case 1:
		List<?> courses= entityManager.createQuery("Select c "+ " from Course c").getResultList();
		return courses;
	case 2:
		/*Same as case 1.But using TypedQuery */
		TypedQuery<Course> query= (TypedQuery<Course>) entityManager.createQuery("Select c "+ " from Course c");
		return query.getResultList();
		
	case 3:
		//////Native Query
		Query nativeQuery=entityManager.createNativeQuery("SELECT * FROM COURSE where id=?",Course.class);
		
		nativeQuery.setParameter(1, 100L);
		
		return nativeQuery.getResultList();
		
	default:
		return null;
	}
}
    
   
	
    
	
}
