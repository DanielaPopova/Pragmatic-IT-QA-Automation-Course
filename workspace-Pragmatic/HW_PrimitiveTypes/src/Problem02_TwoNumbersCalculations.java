import java.util.Scanner;

public class Problem02_TwoNumbersCalculations {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// using integers
		System.out.println("Enter first integer number");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter second integer number");
		int secondNumber = input.nextInt();
		
		int addition = firstNumber + secondNumber;
		int subtraction = Math.abs(firstNumber - secondNumber);
		int product = firstNumber * secondNumber;
		double quotient =  (double)firstNumber / secondNumber;
		int remainder = firstNumber % secondNumber;
		int integerDivision = firstNumber / secondNumber;
		
		System.out.printf(" Addition: %d%n Subtraction: %d%n Product: %d%n Division: %.2f%n Remainder: %d%n Integer Division: %d%n", addition, subtraction, product, quotient, remainder, integerDivision);		
		
		// using floating point
		System.out.println("Enter first floating-point number");
		double firstNumberDouble = input.nextDouble();
		
		System.out.println("Enter second floating-point number");
		double secondNumberDouble = input.nextDouble();
		
		double additionDouble = firstNumberDouble + secondNumberDouble;
		double subtractionDouble = Math.abs(firstNumberDouble - secondNumberDouble);
		double productDouble = firstNumberDouble * secondNumberDouble;
		double quotientDouble =  firstNumberDouble / secondNumberDouble;
		double remainderDouble = firstNumberDouble % secondNumberDouble;		
		
		System.out.printf(" Addition: %.2f%n Subtraction: %.2f%n Product: %.2f%n Division: %.2f%n Remainder: %.2f%n", additionDouble, subtractionDouble, productDouble, quotientDouble, remainderDouble);	
		
		// using generic method
		double sumGeneric = sumTwoNumbers(firstNumber, secondNumber);
		double sumGenericDouble = sumTwoNumbers(firstNumberDouble, secondNumberDouble);
		System.out.println(sumGeneric + " " + sumGenericDouble);
	}
	
	public static <T extends Number> double sumTwoNumbers(T firstNum, T secondNum){
		return firstNum.doubleValue() + secondNum.doubleValue();
	}
}
