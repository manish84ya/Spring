package com.Constructor_Injection_Collection_Property_List;

import java.util.Iterator;
import java.util.List;

public class Address 
{
	private int id;
	private String name;
	private List<String> adr;
	public Address(int id,String name,List<String> adr)
	{
		this.id=id;
		this.name=name;
		this.adr=adr;
	}
	
	public void show()
	{
		System.out.println("Student Id:"+id);
		System.out.println("Student Name:"+name);
		Iterator itr=adr.iterator();
		System.out.println("Student Address:");
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
		
	}

}
