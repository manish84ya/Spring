package com.ArgumentConstructor;

public class Student {
	private Integer RollNumber;
	private String Name;
	private Long MobileNumber;
	private String CollegeName;

	private String id;
	private int marks;
	private String course;

	public Student(String id, String course, int marks) {
		this.id = id;
		this.course = course;
		this.marks = marks;

	}

	/*
	 * public Student(String id,int marks,String course) { this.id=id;
	 * this.marks=marks; this.course=course;
	 * 
	 * }
	 */
	public Student(int RollNumber, String Name, long MobileNumber, String CollegeName) {
		this.RollNumber = RollNumber;
		this.Name = Name;
		this.MobileNumber = MobileNumber;
		this.CollegeName = CollegeName;
	}

	public void Get_Student_Information() {
		System.out.println("Student Name Is:" + Name);
		System.out.println("Student Roll Number Is:" + RollNumber);
		System.out.println("Student Mobile Number Is:" + MobileNumber);
		System.out.println("Student College Name Is:" + CollegeName);
	}

	public void Get_Detail() {
		System.out.println("Student id Is:" + id);
		System.out.println("Student marks Is:" + marks);
		System.out.println("Student Course Is:" + course);

	}

}
