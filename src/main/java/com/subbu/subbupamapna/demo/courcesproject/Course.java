package com.subbu.subbupamapna.demo.courcesproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Course {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	private String name;
	
	
	protected Course() {
		//We used Protected.So No one can use this
	}
	
	
	public Course(String name) {
		this.name=name;	
	}

}
