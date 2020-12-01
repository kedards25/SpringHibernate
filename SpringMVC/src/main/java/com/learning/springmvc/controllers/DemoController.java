package com.learning.springmvc.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;


@Controller
public class DemoController {

	@RequestMapping("/")
	public String index()
	{
		//return "/views/index.jsp"
		return "index";
	}

	@RequestMapping("/welcome")
	public String welcome()
	{
		return "home";
	}
	
}
