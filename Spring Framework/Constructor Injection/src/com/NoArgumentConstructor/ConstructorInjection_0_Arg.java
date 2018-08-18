package com.NoArgumentConstructor;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class ConstructorInjection_0_Arg {

	public static void main(String[] args) 
	{
		Resource rs=new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(rs);
		TextEditor t=(TextEditor)factory.getBean("textEditor");
		t.spellCheck();
		

	}

}
