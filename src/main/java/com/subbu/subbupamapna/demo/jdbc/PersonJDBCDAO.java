package com.subbu.subbupamapna.demo.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class PersonJDBCDAO {
	
	
	@Autowired
	
	JdbcTemplate jdbcTemplate;
	
	
	public List<Person> findAll(){
		
		return jdbcTemplate.query("select * from person", new BeanPropertyRowMapper(Person.class));
		
	}

}
