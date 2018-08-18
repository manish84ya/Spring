package com.Collection_Property_List;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestList {

	public static void main(String[] args) 
	{
		Resource rs=new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		
		Employee e=(Employee)factory.getBean("list");
		List l=e.getEname();
		for(Iterator itr=l.iterator();itr.hasNext();)
		{
			System.out.println(itr.next());
		}
		
	}

}
