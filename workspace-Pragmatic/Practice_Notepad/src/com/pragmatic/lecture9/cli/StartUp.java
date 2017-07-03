package com.pragmatic.lecture9.cli;

import com.pragmatic.lecture9.contracts.IElectronicDevice;
import com.pragmatic.lecture9.contracts.INotepad;
import com.pragmatic.lecture9.models.ElectronicSecuredNotepad;
import com.pragmatic.lecture9.models.Page;
import com.pragmatic.lecture9.models.SecuredNotepad;
import com.pragmatic.lecture9.models.SimpleNotepad;

public class StartUp {

	public static void main(String[] args) {

		INotepad notepad = new SimpleNotepad();

		Page pageFirst = new Page("Heading1", "Some text");
		System.out.println(pageFirst.getPageNumber());
		System.out.println(pageFirst.showPage());

		Page pageSecond = new Page("Heading2", "Some other text");
		System.out.println(pageSecond.getPageNumber());
		pageSecond.setText("Some other other text.");

		notepad.createPage(pageFirst);
		notepad.createPage(pageSecond);

		System.out.println(notepad.showAllPages());

		notepad.deletePageText(1);

		System.out.println(notepad.showAllPages());

		// No such page number error message
		//notepad.deletePageText(3);

		// Secured Notepad demo
		INotepad securePad = new SecuredNotepad("haha");
		securePad.createPage(new Page("Test Title", "Some test text"));

		System.out.println(securePad.showAllPages());

		// Electronic Secured Notepad demo
		IElectronicDevice elSecuredPad= new ElectronicSecuredNotepad("daniela");
		elSecuredPad.start();
		elSecuredPad.createPage(new Page("Electronic secured pad", "Secret text"));
		System.out.println(elSecuredPad.showAllPages());
	}
}
