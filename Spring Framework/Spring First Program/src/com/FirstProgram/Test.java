
package com.FirstProgram;


import java.util.concurrent.SynchronousQueue;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;  

public class Test {

	public static void main(String[] args) 
	{
		
		
		Resource r = new ClassPathResource("applicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(r);
	   // Student s1=new Student();
	  //  Student s2=new Student();
	 /*   System.out.println(s1.hashCode());
	    System.out.println(s2.hashCode());
	 */   
	    
		Student student=(Student)factory.getBean("studentbean");  
		//Student student1=(Student)factory.getBean("studentbean");  
		
	/*	System.out.println(student.hashCode());
	    System.out.println(student1.hashCode());
	*/    
		
		student.Display();
	   Student_Information si=(Student_Information)factory.getBean("sbean");
	   
	   si.Info();
	   
	    Marks m=(Marks)factory.getBean("mbean");
	    m.DisplayMarks();
	}

}
