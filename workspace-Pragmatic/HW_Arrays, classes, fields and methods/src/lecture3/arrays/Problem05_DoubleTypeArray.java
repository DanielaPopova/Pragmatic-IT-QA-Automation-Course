package lecture3.arrays;

public class Problem05_DoubleTypeArray {

	public static void main(String[] args) {
		
		int arraySize = 10;
		int multiplier = 3;
		double[] array = new double[arraySize];
		
		for (int i = 0; i < array.length; i++) {
			array[i] = i * multiplier;
			System.out.print(array[i] + " ");
		}
	}
}
