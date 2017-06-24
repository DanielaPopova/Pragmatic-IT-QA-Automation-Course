package com.pragmatic.lecture6.model.contracts;

import com.pragmatic.lecture6.model.enums.UserType;

public interface AdminUser {
	User createUser(String username, UserType userType);	
	void deleteUser(String username);	
	void printAllUsers();
}
