package com.Autowiring.SI.Map;

public class User 
{
	private String UserName;

	public String getUserName() 
	{
		return UserName;
	}

	public void setUserName(String userName) 
	{
		UserName = userName;
	}
	
public String toString()
{
	return "Username"+UserName;
}

}
