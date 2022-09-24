package com.subbu.subbupamapna.demo.jpaexamples;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;



/*
 TransationalIf we make any transactions ,all of them must successful or fail  
 
 * */

@Repository
@Transactional
public class TeacherJPARepo {
	
	@PersistenceContext
	EntityManager entityManager;
	
	public Teacher findById(int id) {
		/*You need to pass the entity you want along with the primary key*/
		return entityManager.find(Teacher.class, id);
	}
	
	/*We use merge method to update or insert*/
	
	public Teacher update(Teacher teacher) {
		/*Pass Teacher to insert/update*/
		return entityManager.merge(teacher);
	}
	
	public Teacher insert(Teacher teacher) {
		/*Pass Teacher to insert/update*/
		return entityManager.merge(teacher);
	}
	
	
	
	public void delete(int id) {
		/*Before deleting the Teacher ,we need to fetch the Teacher*/
		Teacher teacher=findById(id);
		entityManager.remove(teacher);
		
	}
	
	
	
	
	public List<Teacher> findAll() {
		/*We use JPQL to achieved this*/
		/*JPQL applies queries on entities but not on Database*/
		TypedQuery<Teacher> result= entityManager.createNamedQuery("find_all_persons",Teacher.class);
		
		return result.getResultList();
	}
	
	
	/*If data of input pay load is different then we use Row Mapper to match the Rows of DB*/
	class PersonRowMapper implements RowMapper<Teacher>{
		@Override
		public Teacher mapRow(ResultSet rs, int rowNum) throws SQLException {
			Teacher p=new Teacher();
			p.setId(rs.getInt("userId"));
			p.setName(rs.getString("userName"));
			return null;
		}	
	}
	
}
