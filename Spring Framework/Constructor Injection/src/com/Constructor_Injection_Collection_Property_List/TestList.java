package com.Constructor_Injection_Collection_Property_List;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestList {

	public static void main(String[] args) {
		Resource rs=new ClassPathResource("com/Constructor_Injection_Collection_Property_List/ApplicationContext1.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		Address adr=(Address)factory.getBean("adrs");
		adr.show();

	}

}
