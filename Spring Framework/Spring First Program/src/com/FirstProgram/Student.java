package com.FirstProgram;

import java.util.concurrent.SynchronousQueue;

import lombok.Getter;
import lombok.Setter;

@Getter
/*
 * @Setter
*/
public class Student 
{
	private String Sname;

	Student()
	{
		System.out.println("This is Constructor");
	}
/*	public String getSname() {
		return Sname;
	}
*/
	public void setSname(String sname) {
		System.out.println("this is setter");
		Sname = sname;
	}
	
public void Display()
{
	System.out.println("Name Of Student Is:"+Sname);
}
}
