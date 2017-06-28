package com.pragmatic.lecture7.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem03_FibonacciLikeCollection {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Enter number for first two elements of the collection");
		int firstNum = input.nextInt();
		int secondNum = firstNum;
		List<Integer> numbers = new ArrayList<>();
		int size = 10;
		
		numbers.add(firstNum);
		numbers.add(secondNum);
		
		for (int i = 2; i < size; i++) {
			int next = numbers.get(i - 2) + numbers.get(i - 1);
			numbers.add(next);
		}
		
		System.out.println(numbers.toString());
	}
}
