package com.pragmatic.lecture6.model;

import java.util.Date;

import com.pragmatic.lecture6.model.contracts.User;
import com.pragmatic.lecture6.model.enums.UserState;


public abstract class AbstractUser implements User{
	
	private static final int MIN_USERNAME_LENGTH = 3;
	private static final int MAX_USERNAME_LENGTH = 15;
	private static final String USERNAME_VALID_SYMBOLS = "[a-zA-Z0-9_]+";
	
	private String username;
	private Date registrationDate;	
	private UserState userState;
	
	public AbstractUser(String username) {
		setUsername(username);
		this.registrationDate = new Date();
		this.userState = UserState.LOGGED_OUT;
	}	
	
	public String getUsername() {		
		return username;
	}	
	
	public String getUserRegistrationDate() {		
		return registrationDate.toString();
	}	
	
	public UserState getUserState() {
		return this.userState;
	}

	public void login() {
		if (userState == UserState.LOGGED_IN) {
			System.out.println(("User is already logged in!"));
		} else {
			userState = UserState.LOGGED_IN;
			System.out.println("User has successfully logged in");
		}				
	}
	
	public void logout() {
		if (userState.equals(UserState.LOGGED_OUT)) {
			System.out.println(("User is already logged out!"));
		} else {
			userState = UserState.LOGGED_OUT;
			System.out.println("User has successfully logged out");
		}			
	}	
	
	@Override
	public String toString() {
		StringBuilder info = new StringBuilder();		
		
		info.append("Username: " + username); 
		info.append(System.lineSeparator());
		info.append("Registration Date: " + getUserRegistrationDate());
		info.append(System.lineSeparator());
		info.append("User is " + userState);
		info.append(System.lineSeparator());		
		
		return info.toString();
	}
	
	private void setUsername(String username){
		if (username == null) {
			throw new IllegalArgumentException("Username cannot be null!");
		}
		
		if (username.length() < MIN_USERNAME_LENGTH || username.length() > MAX_USERNAME_LENGTH) {
			throw new IllegalArgumentException(String.format("Username is between %d and %d symbols!", MIN_USERNAME_LENGTH, MAX_USERNAME_LENGTH));
		}
		
		if (!username.matches(USERNAME_VALID_SYMBOLS)) {
			throw new IllegalArgumentException("Username has some invalid symbols!");
		}
		
		this.username = username;
	}	
}
