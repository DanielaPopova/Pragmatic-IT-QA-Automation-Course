package com.pragmatic.lecture9.models;

import java.util.Scanner;

public class SecuredNotepad extends Notepad{

	private static final int MIN_PASSWORD_LENGTH = 3;
	private static final int MAX_PASSWORD_LENGTH = 10;

	private String password;
	private Scanner input;

	public SecuredNotepad(String password) {
		setPassword(password);
		this.input = new Scanner(System.in);
	}

	@Override
	public void createPage(Page newPage) {

		String pass = getUserPassword();
		if (this.password.equals(pass)) {
			super.createPage(newPage);
		} else {
			System.out.println("Wrong password!");
		}
	}

	@Override
	public void deletePageText(int pageNumber) {
		String pass = getUserPassword();
		if (this.password.equals(pass)) {
			super.deletePageText(pageNumber);
		} else {
			System.out.println("Wrong password!");
		}
	}

	@Override
	public String showAllPages() {
		String pass = getUserPassword();
		if (this.password.equals(pass)) {
			return super.showAllPages();
		} else {
			throw new IllegalArgumentException("Wrong password!");
		}
	}

	private void setPassword(String password){
		if (password == null) {
			throw new IllegalArgumentException("Password cannot be null!");
		}

		if (password.trim().length() < MIN_PASSWORD_LENGTH || password.trim().length() > MAX_PASSWORD_LENGTH) {
			throw new IllegalArgumentException(String.format("Password length must be between %d and %d", MIN_PASSWORD_LENGTH, MAX_PASSWORD_LENGTH));
		}

		this.password = password;
	}

	private String getUserPassword(){
		System.out.println("Enter password:");
		String pass = input.nextLine();

		return pass;
	}
}
