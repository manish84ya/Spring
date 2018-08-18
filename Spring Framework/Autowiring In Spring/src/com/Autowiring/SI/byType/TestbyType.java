package com.Autowiring.SI.byType;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestbyType {

	public static void main(String[] args) 
	{
		Resource rs=new ClassPathResource("com/Autowiring/SI/byType/byTypeAppContext.xml");
		BeanFactory bs=new XmlBeanFactory(rs);
		Student st=(Student)bs.getBean("student");
		st.Show();

	}

}
