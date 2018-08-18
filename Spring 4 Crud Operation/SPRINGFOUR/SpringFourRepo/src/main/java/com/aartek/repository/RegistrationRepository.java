package com.aartek.repository;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate4.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.aartek.model.Employee;

@Repository
public class RegistrationRepository 
{
	@Autowired
	private HibernateTemplate ht;
	 @Transactional(readOnly = false)
	public Employee saveRecord(Employee emp)
	{
		 System.out.println("Inside Save ");
			ht.save(emp);
			return emp;
	}
	
	 @Transactional(readOnly=false)
	 public void updateRecord(Employee emp)
		{
			 System.out.println("Inside Update ");
			 
				ht.update(emp);
			//	return emp;
		}
	 @Transactional(readOnly=false)
	 public void deleteRecord(Integer id)
		{
			 System.out.println("Inside Delete ");
			Employee emp= findEmployeeById(id);
			 ht.delete(emp);
		}
	 public List<Employee> getRecord()
	 {
		 System.out.println("Inside get ");
		 List<Employee> list=ht.loadAll(Employee.class);
		 for(Iterator<Employee> itr=list.iterator();itr.hasNext();)
		 {
			 Employee emp=(Employee)itr.next();
			 System.out.println("Get Record from db "+emp.getFirstName() + "  " +emp.getLastName() );
		 }
		return list;
		 
	 }
	 public Employee findEmployeeById(Integer id)
		{
		 	List<Employee> l=(List<Employee>) ht.find("from Employee u where u.id=?",id);
		 	Employee emp = null;
		 	for(Iterator<Employee> itr=l.iterator();itr.hasNext();)
			 {
				  emp=(Employee)itr.next();
				 System.out.println("Particular Id "+emp.getFirstName() + "  " +emp.getLastName() );
			 }
			return emp;
		}
	
	  
}
