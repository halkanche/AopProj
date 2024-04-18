package com.aop.controller;



import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import com.aop.services.PaymentService;
@RestController
public class HomeController {
	@Autowired
	PaymentService service;
	
	@GetMapping("/fun")
	public String fun()
	{
		System.out.println("controller method");
		return "Home controller";
	}
	@GetMapping("/fun1")
	public String fun1()
	{
		return "Home controller";
	}
	}


