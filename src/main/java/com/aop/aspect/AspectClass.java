package com.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectClass {
	@Before(value="execution(* com.aop.controller.HomeController.fun(..))") 
	public void beforeService(JoinPoint joinPoint) 
	{
		System.out.println("payment process started...");
	
	}
	@After(value="execution(* com.aop.controller.HomeController.*(..))")
	public void afterService() {
		System.out.println("Payment Done...");
		
	}

}
