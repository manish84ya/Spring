package com.aartek.model;

import java.util.List;

public interface EmployeeDao 
{
	public Employee saveRecord(Employee emp);
	 
	public Employee updateRecord(Employee emp);
	 
	 public Employee deleteRecord(Employee emp);
	 
	 public List<Employee> getRecord();

}
