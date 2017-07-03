package com.pragmatic.lecture9.contracts;

import com.pragmatic.lecture9.models.Page;

public interface INotepad {
	void createPage(Page newPage);
	void deletePageText(int pageNumber);
	String showAllPages();
}
