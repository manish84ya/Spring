package com.Autowiring.SI.byName;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestbyName 
{

	public static void main(String[] args) 
	{
		Resource rs=new ClassPathResource("com/Autowiring/SI/byName/ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		Categories ct=(Categories)factory.getBean("cat");
		ct.display();

	}

}
