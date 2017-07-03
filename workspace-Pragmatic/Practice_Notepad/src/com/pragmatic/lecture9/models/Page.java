package com.pragmatic.lecture9.models;

public class Page {

	private static final int MIN_TITLE_LENGTH = 2;
	private static final int MAX_TITLE_LENGTH = 30;
	private static int INITIAL_PAGE_NUMBER = 0;

	private String title;
	private String text;
	private int pageNumber;

	public Page(String title, String text) {
		setTitle(title);
		setText(text);
		this.pageNumber = ++INITIAL_PAGE_NUMBER;
	}

	public int getPageNumber(){
		return this.pageNumber;
	}

	public void setText(String text) {
		if (text == null) {
			throw new IllegalArgumentException("Text cannot be null!");
		}

		if (text.trim().length() <= 0) {
			throw new IllegalArgumentException("Text cannot be empty!");
		}

		if (this.text == null) {
			this.text = text;
		} else {
			this.text += ("\n" + text);
		}

	}

	public void deleteText(){
		text = null;
	}

	public String showPage() {

		StringBuilder info = new StringBuilder();
		info.append(title);
		info.append(System.lineSeparator());
		if (text != null) {
			info.append(text);
		}
		info.append(System.lineSeparator());

		return info.toString();
	}

	private void setTitle(String title) {
		if (title == null) {
			throw new IllegalArgumentException("title cannot be null!");
		}

		if (title.trim().length() < MIN_TITLE_LENGTH || title.trim().length() > MAX_TITLE_LENGTH) {
			throw new IllegalArgumentException(String.format("Title length must be between %d and %d", MIN_TITLE_LENGTH, MAX_TITLE_LENGTH));
		}

		this.title = title;
	}
}
