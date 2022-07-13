package com.subbu.subbupamapna.demo.resrexamples;

import java.io.Serializable;



public class Employee  implements Serializable{
	
	int id;
	String name;
	int salary;
	
	
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	

}
