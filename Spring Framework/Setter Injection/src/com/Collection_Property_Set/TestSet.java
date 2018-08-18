package com.Collection_Property_Set;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;


public class TestSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Resource res=new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Colour obj=(Colour)factory.getBean("set");
		Set set=obj.getColor();
		for(Iterator itr=set.iterator();itr.hasNext();)
		{
			String cl=(String)itr.next();
			//Colour obj1=(Colour)itr.next();
			System.out.println(cl);
		}
		
		
	}

}
