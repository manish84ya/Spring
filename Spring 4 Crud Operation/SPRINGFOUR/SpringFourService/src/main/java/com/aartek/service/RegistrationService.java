package com.aartek.service;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aartek.model.Employee;
import com.aartek.repository.RegistrationRepository;

@Service
public class RegistrationService 
{
	@Autowired
	private RegistrationRepository registrationrepository;
	
	public Employee saveRecord(Employee emp)
	{
		System.out.println("Inside RegistrationService Save Record ");
	    Employee employee=registrationrepository.saveRecord(emp);
		return employee;
	}
	public List<Employee> getRecord()
	 {
		System.out.println("Inside RegistrationService Get Record ");
	    List<Employee> list=registrationrepository.getRecord();
	    return list;
	}
	public Employee findEmployeeById(Integer id)
	{
		
		Employee emp =registrationrepository.findEmployeeById(id);
		return emp;
	}
	public void updateRecord(Employee emp)
	{
		 registrationrepository.updateRecord(emp);
	}
	public void deleteById(Integer id)
	{
		 registrationrepository.deleteRecord(id);
	}
}

