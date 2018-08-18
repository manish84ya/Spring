package com.Autowiring.SI.byConstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestbyConstructor {

	public static void main(String[] args) {
Resource rs=new ClassPathResource("com/Autowiring/SI/byConstructor/byConstructorAppContext.xml");
BeanFactory bs=new XmlBeanFactory(rs);
Employee e=(Employee)bs.getBean("emp");
e.Show();
	}

}
