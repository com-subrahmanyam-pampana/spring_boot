package com.subbu.subbupamapna.demo.courcesproject;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="course")
public class Course {
	
	
	@Id
	@GeneratedValue
	private Long id;
	
	

	private String name;
	
	@OneToMany(mappedBy="course")
	private List<Review> reviews=new ArrayList<>();
	
	
	public List<Review> getReviews() {
		return reviews;
	}


	public void addReview(Review review) {
		/*We add only 1 review at a time for better design*/
		this.reviews.add (review);
	}


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
