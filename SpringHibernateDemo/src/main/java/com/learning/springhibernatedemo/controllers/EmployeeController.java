package com.learning.springhibernatedemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.learning.springhibernatedemo.models.EmployeeModel;
import com.learning.springhibernatedemo.services.IEmployeeDao;

@Controller
public class EmployeeController {
	
	@Autowired
	IEmployeeDao empDao;
	
	@Autowired
	EmployeeModel employeeModel;
	
	@GetMapping("/")
	public ModelAndView index()
	{
		List<EmployeeModel> modelList=empDao.getAllEmployees();
		ModelAndView mv=new ModelAndView();
		mv.setViewName("index");
		mv.addObject("empList", modelList);
		return mv;
	}
	
	@GetMapping("/create")
	public String createEmployee()
	{
		EmployeeModel emp=new EmployeeModel(101, "Kedar", "IT", 45000.00);
		boolean isCreated=empDao.addEmployee(emp);
		if (isCreated) 
			return "redirect:/";
		else
			return "errorpage";
		
	}
	
	
	

}
