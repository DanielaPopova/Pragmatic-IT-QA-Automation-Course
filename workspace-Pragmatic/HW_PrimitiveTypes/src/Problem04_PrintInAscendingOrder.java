import java.util.Scanner;

public class Problem04_PrintInAscendingOrder {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first integer number:");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter second integer number:");
		int secondNumber = input.nextInt();
		
		if(firstNumber > secondNumber){
			System.out.println(secondNumber + " " + firstNumber);
		} else if (firstNumber < secondNumber){
			System.out.println(firstNumber + " " + secondNumber);
		} else {
			System.out.println("Numbers are equal.");
		}
	}
}
