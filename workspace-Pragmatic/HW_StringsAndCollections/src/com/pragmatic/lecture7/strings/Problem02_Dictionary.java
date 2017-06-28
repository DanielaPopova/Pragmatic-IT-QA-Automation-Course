package com.pragmatic.lecture7.strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Problem02_Dictionary {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		Map<String, String> dictionary = new HashMap<>();
		
		while (true) {
			
			System.out.println("MENU");
			System.out.println("Choose 1 - 3");
			System.out.println("1 - Add new word");
			System.out.println("2 - Search for word");
			System.out.println("3 - Show all words");
			System.out.println("4 - Exit");			
			
			int choice = input.nextInt();
			input.nextLine();
			
			if (choice == 4) {
				System.out.println("Thank you for using our Dictionary!");
				break;
			}	
			
			switch (choice) {
			case 1:
				System.out.println("Enter new word:");
				String newWord = input.nextLine().toLowerCase();			
				System.out.println("Enter translation:");
				String translation = input.nextLine().toLowerCase();
				
				if (!dictionary.containsKey(newWord)) {
					dictionary.put(newWord, translation);
					System.out.println(newWord + " is added to dictionary");
				} else {
					System.out.println("There is already a translation for that word!");
				}
				
				break;
			case 2:
				System.out.println("Enter word to search:");
				String searchedWord = input.nextLine().toLowerCase();
				
				if (dictionary.containsKey(searchedWord)) {
					for (Map.Entry<String, String> entry : dictionary.entrySet()) {
						if (entry.getKey().equals(searchedWord)) {
							System.out.println(entry.getValue());
						}
					}
				} else {
					System.out.println("There is no such word in the dictionary!");
				}
				
				break;
			case 3:
				if (!dictionary.isEmpty()) {
					for (String word: dictionary.keySet()){							
			            String translatedWord = dictionary.get(word).toString();  
			            System.out.println(word + " -> " + translatedWord);
					} 
				} else {
					System.out.println("Dictionary is empty!");
				}
				
				break;
			default:
				System.out.println("Wrong entry!");
				break;
			}
		}		
	}	
}
