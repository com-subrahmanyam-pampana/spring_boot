package com.subbu.subbupamapna.demo.jpainheritancemapping;

import java.math.BigDecimal;

public class FullTimeEmployee  extends Employee{
	
	
	
	public FullTimeEmployee(String name,BigDecimal salary) {
		super(name);
		this.salary=salary;
		
	}
	
	
	private BigDecimal salary;

}
