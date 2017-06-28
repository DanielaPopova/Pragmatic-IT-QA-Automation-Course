package com.pragmatic.lecture7.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem07_FillArray {

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
		
		secondArray.add(firstArray.get(1));
		
		for (int i = 1; i < firstArraySize - 1; i++) {
			secondArray.add(firstArray.get(i - 1) + firstArray.get(i + 1));
		}
		
		secondArray.add(firstArray.get(firstArraySize - 2));
		
		System.out.println(secondArray.toString());		
	}

}
