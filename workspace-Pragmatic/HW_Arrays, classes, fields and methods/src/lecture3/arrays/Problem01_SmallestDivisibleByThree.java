package lecture3.arrays;

import java.util.Scanner;

public class Problem01_SmallestDivisibleByThree {	
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter array size:");
		int size = input.nextInt();
		int[] numbers = new int[size];
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + (i + 1));
			int number = input.nextInt();
			numbers[i] = number;
		}
		
		int smallestNumber = numbers[0];
		boolean found = false;
		
		for (int number : numbers) {
			if (number % 3 == 0 && number <= smallestNumber) {
				found = true;
				System.out.println("Smallest number divisible by 3 is " + number);
			}
		}
		
		if(!found){
			System.out.println("There isn't a number divisible by 3 in the array");
		}		
	}	
}
