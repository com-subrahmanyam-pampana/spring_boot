package com.subbu.subbupamapna.demo.aop.aopclasses;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Aspect
@Configuration
public class BeforeAspect {
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	
	
	
	
	/*We apply intercept com.subbu.subbupamapna.demo.aop.business classess.
	 * That mean we can call a method before com.subbu.subbupamapna.demo.aop.business classes are executed*/
	
	/*
	 Synamtx:
	 execution(* PACKAGE .*.*(..))
	 * */
	
	@Before("execution(* com.subbu.subbupamapna.demo.aop.business.*.*(..))")
	public void before(JoinPoint jp) {
		//logger.info("Interrapcted method call  {}");
		//JoinPoint gives information about thr classes  and methodsthat interrecepted
		logger.info("Interrapcted method call  {}",jp);
	}
	
	

}
