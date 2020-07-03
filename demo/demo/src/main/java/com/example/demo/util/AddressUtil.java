package com.example.demo.util;

import java.util.Arrays;
import java.util.List;

import com.example.demo.model.Country;

public class AddressUtil 
{
	private static final String ALPHA_NUMERIC_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
	private static final String ALPHA_STRING = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	private static final String NUMERIC_STRING = "1234567890";
	private static final List<Country> COUNTRY_LIST = Arrays.asList(new Country("USA", "US"),new Country("CAN", "Canada"), new Country("MEX", "Mexico"),new Country("NLD", "Netherlands"));
	private static int randomCounter;

	private AddressUtil()
	{
	}

	public static String randomAlphaNumeric(String typeOfInput, int count )
	{
		String randomString=null;
		switch(typeOfInput) {
		case "ALPHA_NUMERIC_STRING":
			randomString = ALPHA_NUMERIC_STRING;
			break;
		case "ALPHA_STRING":
			randomString = ALPHA_STRING;
			break;
		case "NUMERIC_STRING":
			randomString = NUMERIC_STRING;
			break;
		default:
			randomString = ALPHA_NUMERIC_STRING;
			break;

		}
		StringBuilder builder = new StringBuilder();
		while (count-- != 0) 
		{
			int character = (int) (Math.random() * randomString.length());
			builder.append(randomString.charAt(character));
		}
		return builder.toString();
	}

	public static Country getRandomCountryDetails()
	{
		int randomIndex = randomCounter % 4;
		randomCounter++;
		return COUNTRY_LIST.get(randomIndex);
	}

}
