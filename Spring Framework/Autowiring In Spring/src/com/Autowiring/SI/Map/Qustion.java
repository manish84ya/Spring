package com.Autowiring.SI.Map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Qustion 
{
	private Integer qid;
	private String name;
	
	private Answer ans;
	
	public Integer getQid() {
		return qid;
	}
	public void setQid(Integer qid) {
		this.qid = qid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public Answer getAns() {
		return ans;
	}
	public void setAns(Answer ans) {
		this.ans = ans;
	}
	
	public void Display()
	{
		System.out.println("Question ID"+qid);
		System.out.println("Question Name"+name);
		Set<Entry<String, User>> set=ans.getAnswers().entrySet();
		Iterator<Entry<String, User>> itr=set.iterator();
		while(itr.hasNext())
		{
			Entry<String, User> entry=itr.next();
			System.out.println("answer"+entry.getKey().toString()+"Posted By"+entry.getValue().toString());
		}
	}
	

}
