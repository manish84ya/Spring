package com.Map_WithDependentObject;

public class State 
{
	private int scode;
	private String stateName;
	public State(int scode,String stateName)
	{
		this.scode=scode;
		this.stateName=stateName;
	}
	public String toString()
	{
		return "State Code"+scode+"State Name"+stateName;
	}
}
