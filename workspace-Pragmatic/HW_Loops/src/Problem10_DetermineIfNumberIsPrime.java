import java.util.Scanner;

public class Problem10_DetermineIfNumberIsPrime {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter positive number: ");
		int number = input.nextInt();	
		int limit = (int)Math.sqrt(number);
		boolean isPrime = true;
		
		if (number <= 1) {
			System.out.printf("Number %d is not prime", number);
		} else {		
			for (int i = 2; i <= limit; i++) {
				if(number % i == 0){
					isPrime = false;
					break;					
				}
			}
		}
		
		if (isPrime) {
			System.out.printf("Number %d is prime", number);
		} else {
			System.out.printf("Number %d is not prime", number);
		}
	}
}
