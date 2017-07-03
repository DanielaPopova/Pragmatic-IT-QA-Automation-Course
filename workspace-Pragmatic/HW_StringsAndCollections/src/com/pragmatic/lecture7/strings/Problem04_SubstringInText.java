package com.pragmatic.lecture7.strings;

import java.util.Scanner;

public class Problem04_SubstringInText {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String pattern = input.nextLine().toLowerCase();
		String text = input.nextLine().toLowerCase();
		int count = 0;

		int patternIndex = text.indexOf(pattern);

		while (patternIndex != -1) {
			count++;
			patternIndex = text.indexOf(pattern, patternIndex + pattern.length());
		}

		System.out.println(count);

	}

}

/*Description

Write a program that finds how many times a sub-string is contained in a given text (perform case insensitive search).

Input

On the first line you will receive a string - the pattern
On the second line you will receive a string - the text
Output

Print a number on a single line
The number of occurrences

Input
in
We are living in an yellow submarine. We don't have anything else. inside the submarine is very tight. So we are drinking all the day. We will move out of it in 5 days.
Output
9
*/