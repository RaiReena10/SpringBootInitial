package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
// First Hello Controller
@Controller
public class DemoController {
	
	@RequestMapping("/demoUser")
	public String demoUser()
	{
		
		return "demo";
	}

}
