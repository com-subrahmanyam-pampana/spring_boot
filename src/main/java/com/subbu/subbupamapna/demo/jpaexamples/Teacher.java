package com.subbu.subbupamapna.demo.jpaexamples;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NamedQuery;

@Entity
@Table(name="teacher")
@NamedQuery(name="find_all_persons",query="select t from Teacher t")
public class Teacher {
	
	@Id
	@GeneratedValue
	private int id;
	
	@Column()
	private String name;
	

	public Teacher() {
		
	}
	
	public Teacher(int id,String name) {
		super();
		this.id=id;
		this.name=name;
		
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


}
