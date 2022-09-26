package com.subbu.subbupamapna.demo.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subbu.subbupamapna.demo.aop.Dao2;

@Service
public class Business2 {
	
	
	@Autowired
	private Dao2 dao2;
	
	
	public String calculate() {
		
		return dao2.retrieveSomeThing();
		
	}

	
	
}
