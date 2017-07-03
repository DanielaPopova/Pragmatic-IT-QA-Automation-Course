package com.pragmatic.lecture7.strings;

import java.util.Scanner;

public class Problem05_ExtractSentences<T> {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		String wordToCheck = input.nextLine().toLowerCase();
		String text = input.nextLine();

		String[] splittedText = text.split("[.!?]");
		for (String sentence : splittedText) {

			String[] splittedSentence = sentence.toLowerCase().split("\\W+");

			for (String word : splittedSentence) {
				if (word.equals(wordToCheck)) {
					System.out.println(sentence.trim());
					break;
				}
			}
		}
	}
}

/*Description

Write a program that extracts from a given text all sentences containing given word.

Input

On the first line you will receive a string - the word
On the second line you will receive a string - the text
Output

Print only the sentences containing the word on a single line
Input
in
Output
We are living in a yellow submarine. We don't have anything else! Inside the submarine is very tight. So we are drinking all the day. We will move out of it in 5 days.
*/