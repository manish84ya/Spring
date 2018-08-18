package com.BeanLifeCycle;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {
public static void main(String[] args)
{
	//Resource rs=new ClassPathResource("com/BeanLifeCycle/lifecycleContext.xml");
	AbstractApplicationContext context = new ClassPathXmlApplicationContext("com/BeanLifeCycle/lifecycleContext.xml");
	
	
	//BeanFactory bs=new XmlBeanFactory(rs);
	
	Student s=(Student)context.getBean("std");
	System.out.println(s.getSid());
	System.out.println(s.getSname());
	context.registerShutdownHook();
	context.close();
	
//	Student s1=(Student)context.getBean("std");
	/*System.out.println(s.getSid());
	System.out.println(s.getSname());
	*/
	
	/*context.refresh();
	context.destroy();*/
}
}
