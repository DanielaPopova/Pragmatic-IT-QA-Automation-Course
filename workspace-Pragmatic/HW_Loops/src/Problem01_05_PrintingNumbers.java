import java.util.Scanner;

public class Problem01_05_PrintingNumbers {

	public static void main(String[] args) {
		
		// print numbers from 1 to 100
		printNumbersInRange(1, 100);
		
		// print numbers from -20 to 50
		printNumbersInRange(-20, 50);
		
		// print odd numbers from -10 to 10
		printOddNumbersInRange(-10, 10);
		
		// print in reverse from 10 to 1
		printNumberInReverseOrder(10, 1);
		
		// print numbers from user input
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter first number");
		int start = input.nextInt();
		
		System.out.println("Enter second number");
		int end = input.nextInt();
		
		printNumbersInRange(start, end);
	}
	
	public static void printNumbersInRange(int start, int end){
		if (start > end) {
			int from = start;
			start = end;
			end = from;
		}
		
		for (int i = start; i <= end; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
	public static void printOddNumbersInRange(int start, int end){
		for (int i = start; i <= end; i++) {			
			if(i % 2 != 0){
				System.out.print(i + " ");
			}				
		}
		System.out.println();
	}
	
	public static void printNumberInReverseOrder(int end, int start){
		if (end < start) {
			int from = start;
			start = end;
			end = from;
		}
		
		for (int i = end; i >= start; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	
}