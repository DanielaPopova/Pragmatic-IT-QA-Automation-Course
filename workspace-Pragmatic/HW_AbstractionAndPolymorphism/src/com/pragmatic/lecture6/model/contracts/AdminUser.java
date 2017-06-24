package com.pragmatic.lecture6.model.contracts;

import com.pragmatic.lecture6.exceptions.DataBaseInvalidOperationException;
import com.pragmatic.lecture6.model.enums.UserType;

public interface AdminUser {
	User createUser(String username, UserType userType) throws DataBaseInvalidOperationException;	
	void deleteUser(String username);	
	void printAllUsers();
}
