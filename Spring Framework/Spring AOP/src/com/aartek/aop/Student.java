package com.aartek.aop;

public class Student 
{
	private String Name;
	private Integer age;
	public String getName() {
	System.out.println("Name:    "+ Name );
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}

	public Integer getAge() {
	

		System.out.println("Age:    "+ age );
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	 
	public void printThrowException(){
		   System.out.println("Exception raised");
	      throw new IllegalArgumentException();
	   }

}
