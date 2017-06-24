package com.pragmatic.lecture6.cli;

import com.pragmatic.lecture6.exceptions.DataBaseInvalidOperationException;
import com.pragmatic.lecture6.model.*;
import com.pragmatic.lecture6.model.enums.UserType;

public class StartUp {

	public static void main(String[] args) throws DataBaseInvalidOperationException {
		
		AdminUserImpl adminPesho = new AdminUserImpl("peter12");
		
		adminPesho.login();
		System.out.println(adminPesho.getUserRegistrationDate());
		adminPesho.printAllUsers();
		adminPesho.createUser("daniela", UserType.USER);
		adminPesho.printAllUsers();
		
		adminPesho.createUser("georgi", UserType.ADMIN);
		adminPesho.createUser("mihail", UserType.USER);
		adminPesho.createUser("milena", UserType.USER);
		adminPesho.createUser("svetla12", UserType.ADMIN);
		adminPesho.createUser("pesho222", UserType.USER);
		adminPesho.createUser("Svetlin", UserType.USER);
		adminPesho.createUser("Ada11", UserType.USER);
		
		adminPesho.printAllUsers();
		adminPesho.deleteUser("mihail");
		
		adminPesho.createUser("galia", UserType.USER);
		adminPesho.createUser("Mila", UserType.USER);
		
		// "User already exists in data base!" exception message 
		adminPesho.createUser("Ada11", UserType.USER);
		
		// "Data base is already full" exception message
		adminPesho.createUser("brym", UserType.USER);
		
	}

}
