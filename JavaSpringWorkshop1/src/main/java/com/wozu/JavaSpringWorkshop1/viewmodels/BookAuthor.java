package com.wozu.JavaSpringWorkshop1.viewmodels;

public class BookAuthor {
	private String firstName;
	private String middleName;
	private String lastName;
	
	public BookAuthor() {}
	public BookAuthor(String firstName) { this.firstName = firstName; }
	public BookAuthor(String firstName, String lastName) {
		this(firstName);
		this.lastName = lastName;
	}
	public BookAuthor(String firstName, String middleName, String lastName) {
		this(firstName, lastName);
		this.middleName = middleName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getMiddleName() {
		return middleName;
	}
	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
