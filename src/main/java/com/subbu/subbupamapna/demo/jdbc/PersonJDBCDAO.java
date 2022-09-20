package com.subbu.subbupamapna.demo.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJDBCDAO {
	
	
	@Autowired
	
	JdbcTemplate jdbcTemplate;
	
	
	/*If data od input payload is diffrent then we use Row Mapper to match the Rows of DB*/
	class PersonRowMapper implements RowMapper<Person>{

		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			
			Person p=new Person();
			p.setId(rs.getInt("userId"));
			p.setName(rs.getString("userName"));
			return null;
		}
		
		
	}
	
	
	
	  public Person findByIDWithNewRowMapper(int id){
			
			return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] {id},new PersonRowMapper());
			
		}
	
	
	public List<Person> findAll(){
		
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
		
	}
	
     public Person findByID(int id){
		
		return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] {id},new BeanPropertyRowMapper<Person>(Person.class));
		
	}
     
     
     public int deleteByID(int id){
 		
 		return jdbcTemplate.update("delete  from person where id=?", new Object[] {id});
 		
 	}
     
     public int insert(Person person){
  		
  		return jdbcTemplate.update("insert into   person(id ,name)" +"values(?,?)", new Object[] {person.getId(),person.getName()});
  		
  	}
     
     public int updateName(Person person){

    	 /*We should not update the id.ID is a primary key.We can update the name*/
   		return jdbcTemplate.update("update  person   set name = ?" +"where id =?", new Object[] {person.getName(),person.getId()});
   		
   	}
     
     
     
     
     

}
