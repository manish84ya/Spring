package com.Map_Property_Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class TestMap {

	public static void main(String[] args) 
	{
		Resource res=new ClassPathResource("ApplicationContext.xml");
		BeanFactory factory=new XmlBeanFactory(res);
		Student s=(Student)factory.getBean("Map");
		Map map=s.getName();
		Set set=map.entrySet();
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry obj=(Map.Entry)itr.next();

			System.out.println(obj.getKey()+" "+obj.getValue());
		}

	}

}
