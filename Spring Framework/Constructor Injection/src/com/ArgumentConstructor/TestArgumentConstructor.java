package com.ArgumentConstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestArgumentConstructor 
{
	

	public static void main(String[] args) 
	{
		Resource res=new ClassPathResource("ApplicationContext.xml");
		BeanFactory fac=new XmlBeanFactory(res);
		
		StudentInfo stud=(StudentInfo)fac.getBean("std");
		stud.getDetail();
System.out.println("------------------------------------------");
		StudentInfo stud1=(StudentInfo)fac.getBean("std1");
		stud1.getDetail();

System.out.println("------------------------------------------");
		StudentInfo stud2=(StudentInfo)fac.getBean("std2");
		stud2.getDetail();

System.out.println("------------------------------------------");

		StudentInfo stud3=(StudentInfo)fac.getBean("std3");
		stud3.getDetails();
	}
}
