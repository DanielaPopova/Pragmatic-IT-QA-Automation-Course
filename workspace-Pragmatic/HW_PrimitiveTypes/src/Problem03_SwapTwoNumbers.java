import java.util.Scanner;

public class Problem03_SwapTwoNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer number:");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter second integer number:");
		int secondNumber = input.nextInt();
		
		System.out.printf("Numbers: %d %d\n", firstNumber, secondNumber);
		
		int firstNumberValue = firstNumber;
		firstNumber = secondNumber;
		secondNumber = firstNumberValue;
		
		System.out.printf("Swapped numbers: %d %d", firstNumber, secondNumber);
	}
}
