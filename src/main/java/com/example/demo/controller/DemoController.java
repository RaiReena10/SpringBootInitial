package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// Bug Fix Controller
@Controller
public class DemoController {
	
	@RequestMapping("/demoUser")
	public String demoUser()
	{
		
		return "demo";
	}

}
