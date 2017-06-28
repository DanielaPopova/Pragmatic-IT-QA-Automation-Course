package com.pragmatic.lecture7.collections;

import java.util.ArrayList;
import java.util.List;

public class Problem05_DoubleTypeCollection {

	public static void main(String[] args) {
		
		List<Double> numbers = new ArrayList<>();
		int length = 10;
		
		for (int i = 0; i < length; i++) {
			double number = i * 3.0;
			numbers.add(number);
		}
		
		System.out.println(numbers.toString());
	}

}
