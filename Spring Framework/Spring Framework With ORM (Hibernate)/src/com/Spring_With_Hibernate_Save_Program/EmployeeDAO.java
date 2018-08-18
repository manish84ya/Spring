package com.Spring_With_Hibernate_Save_Program;


import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.orm.hibernate3.HibernateTemplate;
public class EmployeeDAO 
{
	HibernateTemplate temp;
	
	
public HibernateTemplate getTemp() {
		return temp;
	}


	public void setTemp(HibernateTemplate temp) {
		this.temp = temp;
	}


public void saveEmployee(EmployeeDTO e)
{
	temp.save(e);
}

public void updateEmployee(EmployeeDTO e)
{
	EmployeeDTO dto = (EmployeeDTO)temp.get(EmployeeDTO.class, e.getEmpid());
	dto.setEmpName(e.getEmpName());
	temp.update(dto);
}
public void deleteEmployee(EmployeeDTO e)
{
	EmployeeDTO dto = (EmployeeDTO)temp.get(EmployeeDTO.class, e.getEmpid());
	
	temp.delete(dto);
}

public List<EmployeeDTO> getEmployee()
{
	List<EmployeeDTO> l=new ArrayList<EmployeeDTO>();
	 l=temp.loadAll(EmployeeDTO.class);  
	 return l;  
}

public void getParticularEmployee(EmployeeDTO e)
{
	EmployeeDTO emp=(EmployeeDTO)temp.get(EmployeeDTO.class,e.getEmpid());
	System.out.println(emp.getEmpid()+" "+emp.getEmpName()+" "+emp.getDesg()+" "+emp.getSalary());
}




/*public HibernateTemplate getTemp() {
	return temp;
}


public void setSessionFactory(SessionFactory sf) {
	temp = new HibernateTemplate(sf);
}*/

}
