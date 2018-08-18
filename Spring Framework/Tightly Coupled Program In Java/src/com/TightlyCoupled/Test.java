package com.TightlyCoupled;

public class Test {

	public static void main(String[] args) 
	{
		IOutputGenerator obj=new CsvOutputGenerator();
		IOutputGenerator obj1=new JsonOutputGenerator();
		
		obj.generateOutput();
		obj1.generateOutput();


	}

}
