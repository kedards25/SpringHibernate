package com.learning.springrestapi.services;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

import com.learning.springrestapi.models.CustomerModel;

@Component
public interface ICustomerDao extends CrudRepository<CustomerModel,Integer> {

}
