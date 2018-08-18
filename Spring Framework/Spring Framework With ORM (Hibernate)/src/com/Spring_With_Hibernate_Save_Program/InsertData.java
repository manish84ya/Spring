package com.Spring_With_Hibernate_Save_Program;


import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class InsertData {

	public static void main(String[] args) 
	{
		Resource rs=new ClassPathResource("ApplicationContext.xml");
		BeanFactory bs=new XmlBeanFactory(rs);
		EmployeeDAO dao=(EmployeeDAO)bs.getBean("d");
		EmployeeDTO emp=new EmployeeDTO();
		
		//InsertRecord(dao, emp);
		GetAllRecord(dao, emp);
		//DeleteRecord(dao, emp);
	    //UpdateRecord(dao, emp);
		//getParticularRecord(dao, emp);
	}
	
	public static void getParticularRecord(EmployeeDAO dao,EmployeeDTO emp)
	{
		emp.setEmpid(1);
		dao.getParticularEmployee(emp);
	}
	
	public static void UpdateRecord(EmployeeDAO dao,EmployeeDTO emp)
	{
		emp.setEmpid(1);
		emp.setEmpName("manish2");
		dao.updateEmployee(emp);
	}
	public static void DeleteRecord(EmployeeDAO dao,EmployeeDTO emp)
	{
		emp.setEmpid(1);
		emp.setEmpName("manish2");
		dao.updateEmployee(emp);
	}
	public static void GetAllRecord(EmployeeDAO dao,EmployeeDTO emp)
	{
		List<EmployeeDTO> l=dao.getEmployee();
		java.util.Iterator<EmployeeDTO> itr=l.iterator();
		while(itr.hasNext())
		{
			EmployeeDTO obj=(EmployeeDTO)itr.next();
			System.out.println(obj.getEmpid()+" "+obj.getEmpName()+" "+obj.getSalary()+" "+obj.getDesg());
		}
	}
	
	public static void InsertRecord(EmployeeDAO dao,EmployeeDTO emp)
	{
		emp.setEmpName("manish");
		emp.setDesg("dev");
		emp.setSalary(25000.0);
		dao.saveEmployee(emp);
		
	}

}
