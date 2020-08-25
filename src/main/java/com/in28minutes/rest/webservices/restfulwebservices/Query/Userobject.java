package com.in28minutes.rest.webservices.restfulwebservices.Query;

public class Userobject {

	private String username;
	private String password;
	
	public Userobject() {
		
	}
	
	public Userobject(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	
}
