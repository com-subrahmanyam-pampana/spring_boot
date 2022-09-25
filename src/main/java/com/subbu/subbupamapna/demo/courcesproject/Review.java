package com.subbu.subbupamapna.demo.courcesproject;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
	
	@Id
	@GeneratedValue
	private Long id;
	private String rating;
	
	private String description;
	
	
	protected Review() {	
	}
    public  Review(String rating,String desription) {
    	this.description=desription;
    	this.rating=rating;
		
	}
	

	
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}


    public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

}
