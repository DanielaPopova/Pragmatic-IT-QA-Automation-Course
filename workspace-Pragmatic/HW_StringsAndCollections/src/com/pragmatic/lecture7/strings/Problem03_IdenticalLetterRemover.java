package com.pragmatic.lecture7.strings;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Problem03_IdenticalLetterRemover {	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Insert a sequence: ");
		String text = input.nextLine();
		Set<Character> result = new LinkedHashSet<>();
		
		for (int i = 0; i < text.length(); i++) {
			char letter = text.charAt(i);
			result.add(letter);
		}
		
		System.out.println(result.toString().replaceAll("[^\\w]+", ""));		
	}
}

/*Създайте програма, която при подаден стринг, да маха еднаквите букви от стринга
▪ Пример : Входен стринг „This is an example“ -> “Thisnexampl”*/