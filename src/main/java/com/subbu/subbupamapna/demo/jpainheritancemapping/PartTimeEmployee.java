package com.subbu.subbupamapna.demo.jpainheritancemapping;

import java.math.BigDecimal;

public class PartTimeEmployee extends Employee {
	
	
	public PartTimeEmployee(String name,BigDecimal hourlyWage) {
		super(name);
		this.hourlyWage=hourlyWage;
		
	}
	
	
	private BigDecimal hourlyWage;

}
