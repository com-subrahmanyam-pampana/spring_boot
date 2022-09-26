package com.subbu.subbupamapna.demo.jpainheritancemapping;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="employee")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
public  abstract class Employee {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	

	private String name;
	

	protected  Employee() {
		//We used Protected.So No one can use this
	}
	
	
	public Employee(String name) {
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