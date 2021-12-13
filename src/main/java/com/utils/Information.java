package com.utils;

import java.io.FileInputStream;
import java.util.Properties;

public class Information { //singleton

	private static Information instanceOfInformation;
	private static Properties properties;
	private static String firstName;
	private static String middleName;
	private static String lastName;
	private static String month;
	private static String day;
	private static String year;
	private static String address;
	private static String city;
	private static String zipcode;
	private static String email;
	private static String reEmail;
	private static String phoneNum;
	private static String configurepath = "configuration/information.property";

	private Information() {
	}

	public static Information instanceOfInformation() {
		if (instanceOfInformation == null) {
			instanceOfInformation = new Information();
			instanceOfInformation.loadProperties();
		}
		return instanceOfInformation;
	}

	public void loadProperties() {
		// BufferedReader bufferedReader;
		// properties=new Properties();
		try {
			// BufferedReader bufferedReader=new BufferedReader(new
			// FileReader(configurepath));
			FileInputStream fis = new FileInputStream(configurepath);
			properties = new Properties();
			properties.load(fis);
		} catch (Exception e) {
			e.printStackTrace();
		}
		firstName = properties.getProperty("firstname");
		middleName = properties.getProperty("middlename");
		lastName = properties.getProperty("lastname");
		month = properties.getProperty("month");
		day =properties.getProperty("day");
		year =properties.getProperty("year");
		address = properties.getProperty("address");
		city = properties.getProperty("city");
		zipcode=properties.getProperty("zipcode");
		email = properties.getProperty("email");
		reEmail = properties.getProperty("reemail");
		phoneNum =properties.getProperty("phonenumber");
	}

	public String getFirstName() {
		return firstName;
	}

	
	public String getMiddleName() {
		return middleName;
	}

	

	public String getLastName() {
		return lastName;
	}

	
	public String getMonth() {
		return month;
	}

	

	public String getDay() {
		return day;
	}

	

	public String getYear() {
		return year;
	}

	

	public String getAddress() {
		return address;
	}

	

	public  String getCity() {
		return city;
	}
	public  String getzipcode() {
		return zipcode;
	}
	

	public  String getEmail() {
		return email;
	}

	public  String getReEmail() {
		return reEmail;
	}


	public String getPhoneNum() {
		return phoneNum;
	}

		
	
}
