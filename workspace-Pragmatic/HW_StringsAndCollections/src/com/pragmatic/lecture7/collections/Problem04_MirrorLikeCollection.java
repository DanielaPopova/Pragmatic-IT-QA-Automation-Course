package com.pragmatic.lecture7.collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem04_MirrorLikeCollection {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);		
		
		System.out.println("Enter collection size");
		int size = input.nextInt();		
		List<Integer> numbers = new ArrayList<>();		
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + (i + 1));			
			numbers.add(i, input.nextInt());			
		}
		
		boolean mirrorLike = true;
		
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) != numbers.get(numbers.size() - 1 - i)) {
				mirrorLike = false;
				break;
			}
		}
		
		String message = mirrorLike ? "collection is mirror like" : "collection is not mirror like";
		System.out.println(message);
	}

}
