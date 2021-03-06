import java.util.Scanner;

public class Problem09_PrintNumberSqure {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int firstNumber = input.nextInt();
		
		System.out.println("Enter second number");
		int secondNumber = input.nextInt();
		
		if (firstNumber > secondNumber) {
			int firstNumberValue = firstNumber;
			firstNumber = secondNumber;
			secondNumber = firstNumberValue;
		}
		
		int square = 1;
		int sum = 0;
		int finalSum = 200;
		
		for (int i = firstNumber; i <= secondNumber; i++) {
			
			if (i % 3 == 0) {
				System.out.print("skip " + i + ", ");
				continue;
			}
			
			square = i * i;
			sum += square;
			
			if (sum > finalSum) {
				System.out.print(square);
			} else {
				System.out.print(square + ", ");
			}
			
			if (sum > finalSum) {
				break;
			} 
		}
	}

}
