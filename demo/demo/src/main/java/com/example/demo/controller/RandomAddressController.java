package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Address;
import com.example.demo.model.Country;
import com.example.demo.util.AddressUtil;

@RestController
public class RandomAddressController 
{
	
	@GetMapping("/randomizer/address")
	public Address getRandromAddress()
	{
		Address randomAdress = new Address();
		randomAdress.setHouse(AddressUtil.randomAlphaNumeric("NUMERIC_STRING",3));
		randomAdress.setStreet(AddressUtil.randomAlphaNumeric("ALPHA_NUMERIC_STRING",10)+" St., Apt "+AddressUtil.randomAlphaNumeric("NUMERIC_STRING",2));
		randomAdress.setPostalCode(AddressUtil.randomAlphaNumeric("ALPHA_NUMERIC_STRING",5));
		randomAdress.setCity(AddressUtil.randomAlphaNumeric("ALPHA_STRING",10));
		randomAdress.setCounty(AddressUtil.randomAlphaNumeric("ALPHA_STRING",10));
		randomAdress.setState(AddressUtil.randomAlphaNumeric("ALPHA_STRING",15));
		randomAdress.setStateCode(AddressUtil.randomAlphaNumeric("ALPHA_STRING",2));
		Country randomCountry = AddressUtil.getRandomCountryDetails();
		randomAdress.setCountry(randomCountry.getCountryName());
		randomAdress.setCountryCode(randomCountry.getCountryCode());
		return randomAdress;
	}
	
}
