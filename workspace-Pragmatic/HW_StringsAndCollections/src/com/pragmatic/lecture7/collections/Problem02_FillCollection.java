package com.pragmatic.lecture7.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem02_FillCollection {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Enter number divisible by 2");
		int size = input.nextInt();		
		List<Integer> numbers = new ArrayList<>();
		List<Integer> copyNum = numbers;
		
		for (int i = 0; i < size / 2; i++) {
			System.out.println("Enter element " + (i + 1));			
			numbers.add(i, input.nextInt());			
		}
		
		numbers.addAll(copyNum);
		System.out.println(numbers.toString());
	}
}
