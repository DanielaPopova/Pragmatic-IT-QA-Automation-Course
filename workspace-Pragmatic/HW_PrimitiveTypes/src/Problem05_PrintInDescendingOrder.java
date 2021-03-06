import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem05_PrintInDescendingOrder {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer number:");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter second integer number:");
		int secondNumber = input.nextInt();
		
		System.out.println("Enter third integer number:");
		int thirdNumber = input.nextInt();
		
		// Using if-else
		if (firstNumber <= secondNumber) {
			if (secondNumber <= thirdNumber) {
				System.out.println(thirdNumber + " " + secondNumber + " " + firstNumber);
			} else if( secondNumber > thirdNumber){
				if(thirdNumber >= firstNumber){
					System.out.println(secondNumber + " " + thirdNumber + " " + firstNumber);
				} else {
					System.out.println(secondNumber + " " + firstNumber + " " + thirdNumber);
				}				
			}
		} else if (firstNumber > secondNumber) {
			if (secondNumber >= thirdNumber) {
				System.out.println(firstNumber + " " + secondNumber + " " + thirdNumber);
			} else if(secondNumber < thirdNumber){
				if(thirdNumber >= firstNumber) {
					System.out.println(thirdNumber + " " + firstNumber + " " + secondNumber);
				} else {
					System.out.println(firstNumber + " " + thirdNumber + " " + secondNumber);
				}
			}
		}
		
		String delimiter = new String(new char[50]).replace('\0', '*');
		System.out.println(delimiter);
		
		// Using List and Sort method
		List<Integer> numbers = new ArrayList<>();
		numbers.add(firstNumber);
		numbers.add(secondNumber);
		numbers.add(thirdNumber);
		
		Collections.sort(numbers);
		Collections.reverse(numbers);
		
		for (int i = 0; i < numbers.size(); i++) {
			System.out.print(numbers.get(i) + " ");
		}
	}
}
