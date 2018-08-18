package com.ArgumentConstructor;

public class StudentInfo 
{
	Student student;
	public StudentInfo(Student student)
	{
		this.student=student;
	}
	
	public void getDetail()
	{
		student.Get_Student_Information();
	
	}
	public void getDetails()
	{
		student.Get_Detail();
	}
	
	

}
