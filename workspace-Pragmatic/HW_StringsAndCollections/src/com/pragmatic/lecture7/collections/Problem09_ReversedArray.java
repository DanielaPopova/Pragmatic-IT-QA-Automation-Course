package com.pragmatic.lecture7.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem09_ReversedArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Integer> numbers = new ArrayList<>();		
		
		System.out.print("Enter size of array: ");
		int size = input.nextInt();
		
		System.out.println("Enter elements of array");
		for (int i = 0; i < size; i++) {
			numbers.add(input.nextInt());
		}	
		
		// using additional array
		List<Integer> reversedArr = new ArrayList<>();
		for (int i = 0; i < size; i++) {
			reversedArr.add(numbers.get(size - 1 - i));
		}
		
		System.out.println(reversedArr.toString());
		
		// using current array
		for (int i = 0; i < size / 2; i++) {
			int first = numbers.get(i);
			int last = numbers.get(size - 1 - i);
			numbers.set(i, last);
			numbers.set(size - 1 - i, first);			
		}
		
		System.out.println(numbers.toString());		
	}
}
