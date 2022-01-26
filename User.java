package com.neonsense.user_registration;

public class User {
	
	private String firstName;
	private String lastName;
	private int phoneNumber;
	private String userName;
	private int userAge;
	
	//Constructors
	
	public User() {}; // If not declared we won't have a default constructor
	
	public User(String firstName, String lastName, int phoneNumber, String userName, int userAge) {
		this.setFirstName(firstName);
		this.setLastName(lastName);
		this.setPhoneNumber(phoneNumber);
		this.setUserName(userName);
		this.setUserAge(userAge);
	}
	
	
	
	
	// Getter and setter for instance variables
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public int getUserAge() {
		return userAge;
	}
	public void setUserAge(int userAge) {
		this.userAge = userAge;
	}
	
	
}
