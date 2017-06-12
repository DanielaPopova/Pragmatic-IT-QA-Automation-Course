import java.util.Scanner;

public class Problem07_DivisibleBy3 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter count");
		int count = input.nextInt();
		int startNumber = 3;
		int divisibleByThreeNumbers = 0;
		
		while (divisibleByThreeNumbers <= count) {
			
			if (divisibleByThreeNumbers == count) {
				break;
			}
			
			if (startNumber % 3 == 0) {
				if (divisibleByThreeNumbers == count - 1) {
					System.out.print(startNumber + " ");
				} else {
					System.out.print(startNumber + ", ");
				}
				
				divisibleByThreeNumbers++;
			}			
			
			startNumber++;
		}		
	}

}
