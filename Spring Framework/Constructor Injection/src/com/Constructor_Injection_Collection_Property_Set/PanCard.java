package com.Constructor_Injection_Collection_Property_Set;

import java.util.Iterator;
import java.util.Set;

public class PanCard 
{
	private int id;
	private String name;
	private Set<String> pan;
	public PanCard(int id,String name,Set<String> pan)
	{
		this.id=id;
		this.name=name;
		this.pan=pan;
	}
	public void Show()
	{
		System.out.println("Employee Id"+id);
		System.out.println("Employee Name"+name);
		System.out.println("Employee Pan Number");
		Iterator itr=pan.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next().toString());
		}
		
	}

}
