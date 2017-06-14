package lecture3.arrays;

import java.util.Scanner;

public class Problem02_DivisibleByTwoArraySize {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter array size divisible by two");
		int size = input.nextInt();
		int[] numbers = new int[size];
		
		for (int i = 0; i < size / 2; i++) {
			System.out.println("Enter element " + (i + 1));
			int number = input.nextInt();
			numbers[i] = number;
			numbers[i + size / 2] = number;
		}
		
		for (int number : numbers) {
			System.out.print(number + " ");
		}
	}
}
