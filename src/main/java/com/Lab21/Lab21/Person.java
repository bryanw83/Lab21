package com.Lab21.Lab21;

import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String firstName;
	private String lastName;
	private String email;
	private String phoneNum;
	private String password;
	
	public Person() {
		
	}

	public Person(String firstName, String lasName, String email, String phoneNum, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lasName;
		this.email = email;
		this.phoneNum = phoneNum;
		this.password = password;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lasName) {
		this.lastName = lasName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + ", phoneNum=" + phoneNum
				+ ", password=" + password + "]";
	}

	
	
}
