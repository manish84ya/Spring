package com.Constructor_Injection_Map_Property_Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMap 
{
	public static void main(String[] args)
	{
		Resource rs=new ClassPathResource("com/Constructor_Injection_Map_Property_Map/ApplicationContext3.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		Question t=(Question)factory.getBean("Map");
		t.show();
		
	}

}
