package com.FirstProgram;

import lombok.Getter;
import lombok.Setter;


public class Marks 
{
	@Getter
	@Setter
	private static int mark1;
	
	/*public static Double getMark() {
		return mark;
	}

	public static void setMark(Double mark) 
	{
		Marks.mark = mark;
	}
*/
	public static void DisplayMarks()
	{
		System.out.println(mark1);
	}
	

}
