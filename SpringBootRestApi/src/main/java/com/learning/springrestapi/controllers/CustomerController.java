package com.learning.springrestapi.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.springrestapi.models.CustomerModel;
import com.learning.springrestapi.services.ICustomerDao;

@RestController
public class CustomerController {

	
	@Autowired
	ICustomerDao custDao;
	
	@Autowired
	CustomerModel customer;
	
	@GetMapping("/")
	public ResponseEntity<List<CustomerModel>> getAll()
	{
		List<CustomerModel> customerList=
				(List<CustomerModel>) custDao.findAll();
		if(customerList.size()>0)
		{
			return new ResponseEntity(customerList,HttpStatus.OK);
		}
		return new ResponseEntity(HttpStatus.NO_CONTENT); 
	}
	
}
