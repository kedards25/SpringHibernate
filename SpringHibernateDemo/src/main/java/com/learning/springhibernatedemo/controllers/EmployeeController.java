package com.learning.springhibernatedemo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.learning.springhibernatedemo.models.EmployeeModel;
import com.learning.springhibernatedemo.services.IEmployeeDao;

@RestController
public class EmployeeController {
	
	@Autowired
	IEmployeeDao empDao;
	
	@Autowired
	EmployeeModel employeeModel;
	
	@GetMapping("/")
	public ResponseEntity<List<EmployeeModel>> index()
	{
		List<EmployeeModel> modelList=empDao.getAllEmployees();
		
		if(modelList.size()>0)
		{
		return new ResponseEntity<List<EmployeeModel>>
		(modelList, HttpStatus.OK);
		}
		return new ResponseEntity<List<EmployeeModel>>
		(HttpStatus.NO_CONTENT);
//		ModelAndView mv=new ModelAndView();
//		mv.setViewName("index");
//		mv.addObject("empList", modelList);
//		return mv;
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
	
	@PostMapping("/add")
	public ResponseEntity<HttpStatus> addEmployee
	(@RequestBody EmployeeModel employee)
	{
		empDao.addEmployee(employee);
		return new ResponseEntity<HttpStatus>(HttpStatus.CREATED);
	}
	
	
	@GetMapping("/getemployee/{id}")
	public ResponseEntity<EmployeeModel> getEmpById(@PathVariable int id)
	{
		employeeModel=empDao.getEmployeeById(id);
		return new ResponseEntity<EmployeeModel>
		(employeeModel, HttpStatus.OK);
	}
	
	@PutMapping("/edit")
	public ResponseEntity<HttpStatus> updateEmployee(@RequestBody EmployeeModel model)
	{
		boolean isUpdated= empDao.updateEmployee(model);
		if(isUpdated)
		{
			return new ResponseEntity<HttpStatus>(HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<HttpStatus>(HttpStatus.NO_CONTENT);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<HttpStatus> deleteEmp(@PathVariable int id)
	{
		 empDao.deleteEmployee(id);
		 return new ResponseEntity<HttpStatus>(HttpStatus.GONE);
		
	}
	
	
	
	

}
