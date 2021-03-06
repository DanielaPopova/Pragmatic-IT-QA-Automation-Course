import java.util.Scanner;

public class Problem06_SumInRange {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number");
		int number = input.nextInt();
		
		if (number < 1) {
			throw new Error("Number should be greater than 1!");
		}
		
		int sum = 0;
		
		for (int i = 1; i <= number; i++) {
			sum += i;
		}
		
		System.out.println("Sum is " + sum);
	}
	
}
