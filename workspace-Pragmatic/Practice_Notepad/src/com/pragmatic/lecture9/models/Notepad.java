package com.pragmatic.lecture9.models;

import java.util.ArrayList;
import java.util.List;

import com.pragmatic.lecture9.contracts.INotepad;

public abstract class Notepad implements INotepad{

	private List<Page> pages;

	public Notepad() {
		this.pages = new ArrayList<Page>();
	}

	@Override
	public void createPage(Page newPage) {
		if (newPage == null) {
			throw new IllegalArgumentException("Page cannot be null!");
		}

		pages.add(newPage);
	}

	@Override
	public void deletePageText(int pageNumber) {

		boolean found = false;

		for (Page page : pages) {
			if (page.getPageNumber() == pageNumber) {
				page.deleteText();
				found = true;
				break;
			}
		}

		if (!found) {
			System.err.println("There is no such page with that number!");
		}
	}

	@Override
	public String showAllPages() {

		String info = "";

		if (pages.isEmpty()) {
			System.out.println("Notepad is empty!");
		} else {
			for (Page page : pages) {

				info += page.showPage();
			}
		}

		return info;
	}

}
