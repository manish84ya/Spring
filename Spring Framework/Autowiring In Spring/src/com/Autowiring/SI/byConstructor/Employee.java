package com.Autowiring.SI.byConstructor;

public class Employee 
{
	Company cmp;
	Company cmp1;
	
	private Integer  empid;
	private String ename;
	private String emob;
	
	
	public Employee(Company cmp,Company cmp1,Integer empid,String ename,String emob)
	{
		this.cmp=cmp;
		this.cmp1=cmp1;
		
		this.empid=empid;
		this.ename=ename;
		this.emob=emob;
	
	}
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEmob() {
		return emob;
	}
	public void setEmob(String emob) {
		this.emob = emob;
	}
	
	public Company getCmp() {
		return cmp;
	}
	public void setCmp(Company cmp) {
		this.cmp = cmp;
	}
	
	
	public void Show()
	{

		System.out.println("\t\t Company Code:"+cmp.getId());
		System.out.println("\t\t Company Name:"+cmp.getCompany_name());
		System.out.println("\t\t Company Revenue:"+cmp.getRevenue());

		System.out.println("\t\t Employee Id:"+empid);
		System.out.println("\t\t Employee Name:"+ename);
		System.out.println("\t\t Employee Id:"+emob);
		System.out.println(cmp.hashCode());
		System.out.println(cmp1.hashCode());
		
		
	}

}
