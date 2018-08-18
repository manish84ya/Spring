package com.Map_WithDependentObject;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

public class Country 
{
	private int id;
	private String Country_Name;
	private Map<State,City>State_City;
	public int getId() 
	{
		return id;
	}
	public void setId(int id) 
	{
		this.id = id;
	}
	public String getCountry_Name() 
	{
		return Country_Name;
	}
	public void setCountry_Name(String country_Name) 
	{
		Country_Name = country_Name;
	}
	public Map<State, City> getState_City() 
	{
		return State_City;
	}
	public void setState_City(Map<State, City> state_City) 
	{
		State_City = state_City;
	}
	public void Show()
	{
		System.out.println("Country Code:");
		System.out.println(id);
		System.out.println("Country Name:");
		System.out.println(Country_Name);
	}
	

}
