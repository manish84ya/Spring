package com.Autowiring.SI.AutoDetect;

public class Department 
{
 private int did;
 private String dname;
 private Employee emp;
public int getDid() {
	return did;
}
public void setDid(int did) {
	this.did = did;
}
 
public String getDname() {
	return dname;
}
public void setDname(String dname) {
	this.dname = dname;
}
public Employee getEmp() {
	return emp;
}
public void setEmp(Employee emp) {
	this.emp = emp;
}
public void  show()
{
	System.out.println(did);
	System.out.println(dname);
	System.out.println(emp.getEmpid());
	System.out.println(emp.getEmpname());
}

}
