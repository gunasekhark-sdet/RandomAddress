package com.example.demo.model;

public class Country
{
	private String countryCode;
	private String countryName;
	
	public Country(String countryCode,String countryName)
	{
		this.countryCode = countryCode;
		this.countryName = countryName;
	}
	
	public String getCountryCode() {
		return countryCode;
	}
	public String getCountryName() {
		return countryName;
	}
}
