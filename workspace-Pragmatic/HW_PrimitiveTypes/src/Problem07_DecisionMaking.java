import java.util.Scanner;

public class Problem07_DecisionMaking {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter value for money");
		double money = input.nextDouble();
		
		System.out.println("Are you sick [true/false]?");
		boolean amSick = input.nextBoolean();
		
		if (amSick) {
			System.out.println("Not going anywhere");
			if (money >= 10.0) {
				System.out.println("Gonna buy some meds.");
			} else {
				System.out.println("Gonna stay home and drink some tea.");
			}
		} else {
			if (money <= 10) {
				System.out.println("Gonna meet with friends for a cup of coffee.");
			} else {
				System.out.println("Gonna get wild clubbing!");
			}
		}
	}
}
