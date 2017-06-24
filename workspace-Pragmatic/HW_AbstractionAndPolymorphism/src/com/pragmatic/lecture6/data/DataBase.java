package com.pragmatic.lecture6.data;

import java.util.ArrayList;
import java.util.List;

import com.pragmatic.lecture6.model.contracts.User;

public class DataBase {
	
	private List<User> users;
	private int maxUsersCount;
	
	public DataBase(int maxUsersCount) {		
		this.users = new ArrayList<User>();
		this.maxUsersCount = maxUsersCount;
	}

	public List<User> getUsers() {
		return this.users;
	}
	
	public int getMaxUsersCount() {
		return this.maxUsersCount;
	}	
}
