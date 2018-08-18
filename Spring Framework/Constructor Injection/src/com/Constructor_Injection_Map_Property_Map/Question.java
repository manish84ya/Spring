package com.Constructor_Injection_Map_Property_Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Question 
{
	private int id;
	private String name;
	private Map<String, String> ans;
	public Question(int id,String name,Map<String ,String> ans)
	{
		this.id=id;
		this.name=name;
		this.ans=ans;
	}
	public void show()
	{
		System.out.println("Question Id Is:"+id);
		System.out.println("Question Is:"+name);
		System.out.println("Answer");
		Set<Entry<String,String>> set=ans.entrySet();
		Iterator<Entry<String , String>> itr=set.iterator();
		while(itr.hasNext())
		{
			Map.Entry<String, String> en=(Map.Entry<String, String>)itr.next();
			System.out.println(en.getKey()+":"+en.getValue());
		}
		
	}

}
