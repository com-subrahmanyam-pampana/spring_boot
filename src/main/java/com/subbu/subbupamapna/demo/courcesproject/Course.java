package com.subbu.subbupamapna.demo.courcesproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	

	private String name;
	
	
	protected  Course() {
		//We used Protected.So No one can use this
	}
	
	
	public Course(String name) {
		this.name=name;	
	}
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


}
