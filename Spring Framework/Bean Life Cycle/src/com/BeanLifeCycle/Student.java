package com.BeanLifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Student  implements InitializingBean/*,DisposableBean*/
{
	private Integer sid;
	private String sname;
/*	private College col;
 * 
*/	
	public Student()
	{
      // destroy(); 			
 		
		System.out.println("constructor");
	}
	
	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
		System.out.println("setter");
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}

public void init()
{
	System.out.println("show");
}
public void afterPropertiesSet() {
  System.out.println("after property");
 }
public void destroy()  {
	System.out.println("destroy");
}
	

}
