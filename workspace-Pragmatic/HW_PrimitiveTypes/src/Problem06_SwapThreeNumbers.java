import java.util.Scanner;

public class Problem06_SwapThreeNumbers {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer number:");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter second integer number:");
		int secondNumber = input.nextInt();
		
		System.out.println("Enter second integer number:");
		int thirdNumber = input.nextInt();
		
		System.out.printf("First number: %d%nSecond number: %d%nThird number: %d%n", firstNumber, secondNumber, thirdNumber);	
		
		int firstNumberValue = firstNumber;
		firstNumber = secondNumber;
		secondNumber = thirdNumber;
		thirdNumber = firstNumberValue;				
			
		System.out.printf("After swapping:%nFirstNumber: %d%nSecond number: %d%nThird number: %d%n", firstNumber, secondNumber, thirdNumber);
	}
}
