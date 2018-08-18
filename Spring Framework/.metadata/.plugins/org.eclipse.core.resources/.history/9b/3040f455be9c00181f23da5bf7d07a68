package com.LooselyCouple;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Test {

	public static void main(String[] args) 
	{
		Resource res=new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
	/*	ApplicationContext context =
				new ClassPathXmlApplicationContext(new String[] {"ApplicationContext.xml"});
		OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	output.generateOutput();
		OutputHelper output1 = (OutputHelper)context.getBean("OutputHelper1");
    	output1.generateOutput();
	*/	
    	
		OutputHelper obj=(OutputHelper)factory.getBean("OutputHelper");
		obj.generateOutput();
		System.out.println(obj.hashCode());
		
		OutputHelper obj1=(OutputHelper)factory.getBean("OutputHelper1");
		obj1.generateOutput();
		System.out.println(obj1.hashCode());
		
	}

	

}
