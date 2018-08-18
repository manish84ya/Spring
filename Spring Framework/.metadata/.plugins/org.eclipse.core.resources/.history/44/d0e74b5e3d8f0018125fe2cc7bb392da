package com.aartek.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationcontext.xml");
		MyBookService obj=(MyBookService)ac.getBean("b");
		obj.printBook("Java Programming");
		obj.printErrorBook();
	}
}
