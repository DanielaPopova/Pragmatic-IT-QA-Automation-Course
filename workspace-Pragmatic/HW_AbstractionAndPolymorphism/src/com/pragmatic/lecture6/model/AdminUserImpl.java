package com.pragmatic.lecture6.model;

import com.pragmatic.lecture6.data.DataBase;
import com.pragmatic.lecture6.exceptions.DataBaseInvalidOperationException;
import com.pragmatic.lecture6.model.contracts.*;
import com.pragmatic.lecture6.model.enums.*;

public class AdminUserImpl extends AbstractUser implements AdminUser{
	
	private static final int MAX_USERS_COUNT = 10;
	
	private DataBase dataBase;
	
	public AdminUserImpl(String username) {
		super(username);	
		this.dataBase = new DataBase(MAX_USERS_COUNT);
	}
	
	@Override
	public User createUser(String username, UserType userType) throws DataBaseInvalidOperationException {
		
		if (this.getUserState().equals(UserState.LOGGED_OUT)) {
			throw new DataBaseInvalidOperationException("User must be logged in to proceed!");
		}		
		
		if (dataBase.getUsers().size() >= MAX_USERS_COUNT) {
			throw new DataBaseInvalidOperationException("Data base is already full!");
		}
		
		for (User user : dataBase.getUsers()) {
			if (user.getUsername().equals(username)) {
				throw new DataBaseInvalidOperationException(String.format("User %s already exists in data base!", user.getUsername()));
			}
		}
		
		User newUser;
		
		switch (userType) {
		case USER:
			newUser = new UserImpl(username);
			break;			
		case ADMIN:
			newUser = new AdminUserImpl(username);
			break;
		default:
			throw new IllegalArgumentException("Invalid user type!");
		}
		
		dataBase.getUsers().add(newUser);
		System.out.printf("User %s is added in data base", newUser.getUsername());
		System.out.println(System.lineSeparator());
		
		return newUser;				
	}	

	@Override
	public void deleteUser(String username) {
		
		if (this.getUserState().equals(UserState.LOGGED_IN)) {
			if (dataBase.getUsers().size() == 0) {
				System.out.println(("Cannot delete from empty data base!"));			
			} else {
				boolean isFound = false;
				
				for (User user : dataBase.getUsers()) {
					if (user.getUsername().equals(username)) {
						isFound = true;
						dataBase.getUsers().remove(user);
						break;
					}
				}
				
				if (isFound) {
					System.out.printf("User %s is deleted from data base!", username);
					System.out.println(System.lineSeparator());
				} else {
					System.out.println("There is no such user in data base!");
				}		
			}			
		} else {
			System.out.println(("User must be logged in to proceed!"));
		}		
	}	

	@Override
	public void printAllUsers() {
		if (dataBase.getUsers().isEmpty()) {
			System.out.println("Data base is empty!");
		} else {
			for (User user : dataBase.getUsers()) {
				System.out.println(user.toString());		
			}
		}				
	}
}
