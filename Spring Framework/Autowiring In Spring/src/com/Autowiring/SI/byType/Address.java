package com.Autowiring.SI.byType;

public class Address 
{
	private Integer Pincode;
	private String StreetName;
	private Integer House_Number;
	private String city;
	private String state;
	public Integer getPincode() {
		return Pincode;
	}
	public void setPincode(Integer pincode) {
		Pincode = pincode;
	}
	public String getStreetName() {
		return StreetName;
	}
	public void setStreetName(String streetName) {
		StreetName = streetName;
	}
	public Integer getHouse_Number() {
		return House_Number;
	}
	public void setHouse_Number(Integer house_Number) {
		House_Number = house_Number;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	

}
