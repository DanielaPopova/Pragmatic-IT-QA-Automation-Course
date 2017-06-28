package com.pragmatic.lecture7.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem01_SmallestDivisible {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
	
		System.out.println("Enter collection size");
		int size = input.nextInt();
		List<Integer> numbers = new ArrayList<>();
		int smallest = Integer.MAX_VALUE;
		boolean isFound = false;
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + (i + 1));
			numbers.add(input.nextInt());
			if (numbers.get(i) < smallest && numbers.get(i) % 3 == 0) {
				smallest = numbers.get(i);
				isFound = true;
			}
		}
		
		if (isFound) {
			System.out.println("Smallest number divisible by 3 is " + smallest);
		} else {
			System.out.println("There is no such number in array " + numbers.toString());
		}
	}
}
