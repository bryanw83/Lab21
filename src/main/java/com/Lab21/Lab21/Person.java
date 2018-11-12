package com.Lab21.Lab21;


import org.springframework.stereotype.Component;

@Component
public class Person {
	
	private String firstName;
	private String lastName;
	private String age;
	private String address;
	private String email;
	private String phoneNum;
	private String password;
	private String choice;
	
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

	public void setEmail(String userEmail) {
		this.email = userEmail;
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
	
	

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
	
	

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}
	
	

	public String getChoice() {
		return choice;
	}

	public void setChoice(String choice) {
		this.choice = choice;
	}

	@Override
	public String toString() {
		return "First Name: " + firstName + " Last Name:" + lastName + "Age: " + age + "Address: " + address +  "Email: " + email + " Phone Number: " + phoneNum
				+ " Password: " + password;
	}

	
	
}
