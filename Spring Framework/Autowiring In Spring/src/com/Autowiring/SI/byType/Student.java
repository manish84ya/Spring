package com.Autowiring.SI.byType;

public class Student 
{
	Address adr;
	Address adr1;
	
	private Integer uid;
	private String student_name;
	private Integer age;
	/*public Student()
	{
		
	}
	public Student(Address adr,Integer uid,String student_name,Integer age,Address adr1)
	{
		this.adr=adr;
		this.uid=uid;
		this.student_name=student_name;
		this.age=age;
		this.adr1=adr1;
		
	}
	
	
	*/
	public Address getAdr1() {
		return adr1;
	}
	public void setAdr1(Address adr1) {
		this.adr1 = adr1;
	}
	public Address getAdr() {
		return adr;
	}
	public void setAdr(Address adr) {
		this.adr = adr;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getStudent_name() {
		return student_name;
	}
	public void setStudent_name(String student_name) {
		this.student_name = student_name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	
	public void Show()
	{
		System.out.println("\t\t Student Detail: ");
		System.out.println("\t\t Student Uid: "+uid);
		System.out.println("\t\t Student Name: "+student_name);
		System.out.println("\t\t Student Age: "+age);
		System.out.println("\t\t Address: ");
		System.out.println("\t\t House Number: "+adr.getHouse_Number());
		System.out.println("\t\t Street Name: "+adr.getStreetName());
		System.out.println("\t\t City: "+adr.getCity());
		System.out.println("\t\t Pin Code: "+adr.getPincode());
		System.out.println("\t\t State: "+adr.getState());
		System.out.println(adr.hashCode());
		System.out.println(adr1.hashCode());
		
		
		
	}

}
