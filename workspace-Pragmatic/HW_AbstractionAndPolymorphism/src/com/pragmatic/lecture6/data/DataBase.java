package com.pragmatic.lecture6.data;

import java.util.ArrayList;
import java.util.List;

import com.pragmatic.lecture6.model.contracts.User;

public class DataBase {
	
	private List<User> users;
	private int maxUsersCount;
	
	public DataBase(int maxUsersCount) {		
		this.users = new ArrayList<User>();
		setMaxUsersCount(maxUsersCount);
	}

	public List<User> getUsers() {
		return this.users;
	}
	
	public int getMaxUsersCount() {
		return this.maxUsersCount;
	}

	private void setMaxUsersCount(int maxUsersCount) {
		if (maxUsersCount < 0) {
			throw new IllegalArgumentException("User count cannot be negative!");
		}
		
		this.maxUsersCount = maxUsersCount;
	}	
}