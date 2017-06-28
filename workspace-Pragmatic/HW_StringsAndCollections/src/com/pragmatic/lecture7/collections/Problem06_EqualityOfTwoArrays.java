package com.pragmatic.lecture7.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem06_EqualityOfTwoArrays {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		List<Integer> firstArray = new ArrayList<>();
		List<Integer> secondArray = new ArrayList<>();
		
		System.out.print("Enter size of first array: ");
		int firstArraySize = input.nextInt();
		
		System.out.println("Enter elements of first array");
		for (int i = 0; i < firstArraySize; i++) {
			firstArray.add(input.nextInt());
		}
		
		System.out.print("Enter size of second array: ");
		int secondArraySize = input.nextInt();		
		
		System.out.println("Enter elements of second array");
		for (int i = 0; i < secondArraySize; i++) {
			secondArray.add(input.nextInt());
		}
		
		boolean areSizesEqual = firstArray.size() == secondArray.size() ? true : false;
		boolean areElementsEqual = true;
		
		if (areSizesEqual) {
			for (int i = 0; i < firstArray.size(); i++) {
				if (firstArray.get(i) != secondArray.get(i)) {
					areElementsEqual = false;
					break;
				}
			}
		}
		
		if (areElementsEqual) {
			System.out.println("Arrays have equal elements");
		} else {
			System.out.println("Arrays don't have equal elements");
		}
		
		if (areSizesEqual) {
			System.out.println("Arrays have equal size");
		} else {
			System.out.println("Arrays don't have equal size");
		}

	}

}
