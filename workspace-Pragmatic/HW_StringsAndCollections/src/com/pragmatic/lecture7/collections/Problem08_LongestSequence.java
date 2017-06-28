package com.pragmatic.lecture7.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem08_LongestSequence {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Integer> numbers = new ArrayList<>();		
		
		System.out.print("Enter size of array: ");
		int size = input.nextInt();
		
		System.out.println("Enter elements of array");
		for (int i = 0; i < size; i++) {
			numbers.add(input.nextInt());
		}
		
		int frequency = 1;
		int repeatedNum = numbers.get(0);
		int bestFrequency = 1;
		int bestNumber = numbers.get(0);
		List<Integer> sequence = new ArrayList<>();
		
		for (int i = 0; i < size - 1; i++) {
			if (numbers.get(i) == numbers.get(i + 1)) {
				repeatedNum = numbers.get(i);
				frequency++;
				
				if (frequency > bestFrequency) {
					bestFrequency = frequency;
					bestNumber = repeatedNum;
				}
			} else {
				frequency = 1;
				repeatedNum = 0;
			}
		}
		
		for (int i = 0; i < bestFrequency; i++) {
			sequence.add(bestNumber);
		}
		
		System.out.println(sequence.toString());
	}

}
