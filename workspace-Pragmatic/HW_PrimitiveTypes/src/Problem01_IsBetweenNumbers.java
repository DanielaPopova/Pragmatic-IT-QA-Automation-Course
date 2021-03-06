import java.util.Scanner;

public class Problem01_IsBetweenNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number:");	
		double firstNumber = input.nextDouble();
		
		System.out.println("Enter second number:");
		double secondNumber = input.nextDouble();
		
		System.out.println("Enter third number to check if it's between first and second number:");
		double thirdNumber = input.nextDouble();
		
		// Swap if first number is bigger than second - save some additional if-else checks
		if (firstNumber > secondNumber) {
			double firstNumberValue = firstNumber;
			firstNumber = secondNumber;
			secondNumber = firstNumberValue;
		}
		
		if (firstNumber < thirdNumber) {
			if (thirdNumber < secondNumber) {
				System.out.format("Number %.2f is between %.2f and %.2f", thirdNumber, firstNumber, secondNumber);
			} else if (thirdNumber == secondNumber) {
				System.out.printf("Number to check %.2f is bigger than first number %.2f and equal to second number %.2f", thirdNumber, firstNumber, secondNumber);
			} else {
				System.out.printf("Number %.2f is not between %.2f and %.2f", thirdNumber, firstNumber, secondNumber);
			}
		}
		else if(firstNumber == thirdNumber) {
			if (thirdNumber < secondNumber) {
				System.out.format("Number to check %.2f is equal to first number %.2f and smaller than the second number %.2f", thirdNumber, firstNumber, secondNumber);
			} else if (thirdNumber == secondNumber) {
				System.out.println("All numbers are equal!");
			} else {
				System.out.printf("Number %.2f is not between %.2f and %.2f", thirdNumber, firstNumber, secondNumber);
			}
		} 
		else { // When firstNumber is smaller than the number to check (third number), it doesn't matter what the second number is
			System.out.printf("Number %.2f is not between %.2f and %.2f", thirdNumber, firstNumber, secondNumber);
		}
	}
}
