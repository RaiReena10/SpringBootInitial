package com.example.demo.controller;

import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.RequestMapping;

// Hot Fix Branch  DemoController
@Controller
public class DemoController {	
	@RequestMapping("/demoUser")
	public String demoUser()
	{
		//hot fix
		return "demo";
	}

}
