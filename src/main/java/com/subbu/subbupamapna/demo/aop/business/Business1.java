package com.subbu.subbupamapna.demo.aop.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.subbu.subbupamapna.demo.aop.Dao1;

@Service
public class Business1 {
	
	
	@Autowired
	private Dao1 dao1;
	
	
	public String calculate() {
		
		return dao1.retrieveSomeThing();
		
	}

	
	
}
