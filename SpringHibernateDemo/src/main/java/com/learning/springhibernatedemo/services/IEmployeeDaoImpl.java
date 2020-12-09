package com.learning.springhibernatedemo.services;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.learning.springhibernatedemo.models.EmployeeModel;



@Repository
@Transactional
public class IEmployeeDaoImpl implements IEmployeeDao {

	@Autowired
	SessionFactory factory;	//this would give us an object of Session
	
	@Autowired
	EmployeeModel empMdl;
	
	public List<EmployeeModel> getAllEmployees() {
		List<EmployeeModel>	employeeList=factory
				.getCurrentSession()
				.createQuery(" from com.learning.springhibernatedemo.models.EmployeeModel")
				.list();
		return employeeList;
	}

	public EmployeeModel getEmployeeById(int employeeId) {
		EmployeeModel model=(EmployeeModel)factory
				.getCurrentSession()
				.createQuery(" from com.learning.springhibernatedemo.models.EmployeeModel"
						+ " where empId="+employeeId)
				.list()
				.get(0);
		System.out.println(model);
		return model;
	}

	public boolean addEmployee(EmployeeModel model) {
//		EmployeeModel empModel=null;
//		empModel=(EmployeeModel)
				factory
			.getCurrentSession()
			.save(model);
//		
//		if(empModel!=null)
//		{
			return true;
//		}
//		return false;
	}

	public boolean updateEmployee(EmployeeModel model) {
		int receivedId=model.getEmpId();
		EmployeeModel empModel=(EmployeeModel)factory
				.getCurrentSession()
				.createQuery(" from com.learning.springhibernatedemo.models.EmployeeModel"
						+ " where empId="+receivedId)
				.list()
				.get(0);
		empModel.setEmpName(model.getEmpName());
		empModel.setEmpDept(model.getEmpDept());
		empModel.setEmpSal(model.getEmpSal());
		
//		EmployeeModel emplModel=null;
//		emplModel=(EmployeeModel)
		factory
			.getCurrentSession()
			.save(model);
//		
//		if(empModel!=null)
//		{
			return true;
//		}
//		return false;
	}

	public void deleteEmployee(int employeeId) {
		EmployeeModel empModel=(EmployeeModel)factory
				.getCurrentSession()
				.createQuery(" from com.learning.springhibernatedemo.models.EmployeeModel"
						+ " where empId="+employeeId)
				.list()
				.get(0);
		factory
		.getCurrentSession()
		.delete(empModel);
	}
	

}
