package lecture3.arrays;

import java.util.Scanner;

public class Problem03_FibonacciLikeArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number");
		int firstElement = input.nextInt();
		
		int arraySize = 10;
		int[] array = new int[arraySize];
		
		for (int i = 0; i < array.length; i++) {
			if(i == 0 || i == 1){
				array[i] = firstElement;
			} else {
				int nextElement = array[i - 1] + array[i - 2];
				array[i] = nextElement;
			}			
		}
		
		for (int number : array) {
			System.out.print(number + " ");
		}
	}

}
