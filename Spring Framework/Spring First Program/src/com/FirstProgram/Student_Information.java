package com.FirstProgram;

import lombok.Getter;
import lombok.Setter;


public class Student_Information 
{
	@Getter
	@Setter
	private static Integer roll;
	
	public static void Info()
	{
		System.out.println(roll);
	}

}
