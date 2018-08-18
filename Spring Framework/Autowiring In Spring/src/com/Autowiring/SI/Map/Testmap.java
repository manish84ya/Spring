package com.Autowiring.SI.Map;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Testmap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Resource rs=new ClassPathResource("com/Autowiring/SI/Map/MapContext.xml");
		BeanFactory bs=new XmlBeanFactory(rs);
		Qustion q=(Qustion)bs.getBean("ques");
		q.Display();
	}

}
