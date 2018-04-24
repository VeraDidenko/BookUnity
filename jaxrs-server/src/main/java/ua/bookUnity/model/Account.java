package ua.bookUnity.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Account {
	
	private String login;
	private String password;
	private String gender;
	private String firstName;
	private String secondName;
	private String thirdName;
	private Integer age;
	private String phoneNumber;
	private String city;
	private String region;
	private String country;
	
	public Account() {}
	
	public Account(String login,String password,String gender,String firstName,String secondName,String thirdName,Integer age,String phoneNumber,String city,String region,String country) {
		this.login = login;
		this.password = password;
		this.gender = gender;
		this.firstName = firstName;
		this.secondName = secondName;
		this.thirdName = thirdName;
		this.age = age;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.region = region;
		this.country = country;	
	}
	
}
