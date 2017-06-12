import java.util.Scanner;

public class Problem08_PrintingTableOfNumbers {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		// suppose it's a quadratic matrix
		System.out.print("Enter size: ");
		int size = input.nextInt();
		int counter = size - 1;
		
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {				
				System.out.print(counter);
			}
			counter += 2;
			System.out.println();
		}
	}

}
