package com.Map_WithDependentObject;

public class City 
{
	private int code;
	private String cityName;
	public City(int code,String cityName)
	{
		this.code=code;
		this.cityName=cityName;
	}
	public String toString()
	{
		return "City Code:"+code+"City Name:"+cityName;
	}

}
