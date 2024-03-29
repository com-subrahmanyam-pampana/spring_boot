package com.subbu.subbupamapna.demo.courcesproject;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.transaction.Transactional;

@Entity
public class Student {
	
	
	@Id
	@GeneratedValue
	private Long id;
	

	@Column(nullable=false)  
	private String name;
	
	
	@OneToOne(
			cascade = CascadeType.ALL,
			fetch=FetchType.EAGER
			)
	private Passport passport;
	
	
	public Passport getPassport() {
		return passport;
	}

	public void setPassport(Passport passport) {
		this.passport = passport;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	protected  Student() {
		
	}
	

}
