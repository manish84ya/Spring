package com.Constructor_Injection_Collection_Property_Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestSet {

	public static void main(String[] args) 
	{
		Resource rs=new ClassPathResource("com/Constructor_Injection_Collection_Property_Set/ApplicationContext2.xml");
		BeanFactory factory = new XmlBeanFactory(rs);
		PanCard p=(PanCard)factory.getBean("pn");
		p.Show();

	}

}
