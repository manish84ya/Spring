package com.Autowiring.SI.AutoDetect;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestAutoDetect_not_Avaialble {

	public static void main(String[] args) {
Resource rs=new ClassPathResource("com/Autowiring/SI/AutoDetect/AutodetectContext.xml");
BeanFactory fs=new XmlBeanFactory(rs);
Department ds=(Department)fs.getBean("dept");
ds.show();

	}

}
