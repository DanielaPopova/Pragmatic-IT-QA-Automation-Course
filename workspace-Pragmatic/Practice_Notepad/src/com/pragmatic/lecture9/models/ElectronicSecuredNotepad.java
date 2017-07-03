package com.pragmatic.lecture9.models;

import com.pragmatic.lecture9.contracts.IElectronicDevice;

public class ElectronicSecuredNotepad extends SecuredNotepad implements IElectronicDevice {

	private boolean isStarted;

	public ElectronicSecuredNotepad(String password) {
		super(password);
		this.isStarted = false;
	}

	@Override
	public void start() {
		if (isStarted) {
			System.out.println("Device is already started!");
		} else {
			isStarted = true;
		}
	}

	@Override
	public void stop() {
		if (!isStarted) {
			System.out.println("Device was already stopped!");
		} else {
			isStarted = false;
		}
	}

	@Override
	public boolean isStarted() {
		return this.isStarted;
	}

	@Override
	public void createPage(Page newPage) {
		if (isStarted) {
			super.createPage(newPage);
		} else {
			System.out.println("Device must be started!");
		}
	}

	@Override
	public void deletePageText(int pageNumber) {
		if (isStarted) {
			super.deletePageText(pageNumber);
		} else {
			System.out.println("Device must be started!");
		}
	}

	@Override
	public String showAllPages() {
		if (isStarted) {
			return super.showAllPages();
		} else {
			throw new IllegalArgumentException("Device must be started!");
		}
	}
}
