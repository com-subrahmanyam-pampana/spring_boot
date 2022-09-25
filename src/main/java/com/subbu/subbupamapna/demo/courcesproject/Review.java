package com.subbu.subbupamapna.demo.courcesproject;

import javax.persistence.Entity;

@Entity
public class Review {
	
	
	private Long id;
	private String rating;
	private String desription;
	
	
	protected Review() {	
	}
    public  Review(String desription) {
    	this.desription=desription;
		
	}
    
    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDesription() {
		return desription;
	}


	public void setDesription(String desription) {
		this.desription = desription;
	}


}
