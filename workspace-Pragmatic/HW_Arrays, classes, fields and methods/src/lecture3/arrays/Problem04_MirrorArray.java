package lecture3.arrays;

import java.util.Scanner;

public class Problem04_MirrorArray {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter array size");
		int size = input.nextInt();
		int[] array = new int[size];
		boolean isMirror = true;
		
		for (int i = 0; i < size; i++) {
			System.out.println("Enter element " + (i + 1));
			int number = input.nextInt();
			array[i] = number;
		}
		
		for (int i = 0; i < array.length; i++) {
			if(array[i] != array[size - 1 - i]){
				isMirror = false;
				break;
			}
		}
		
		if (isMirror) {
			System.out.println("Array is mirror like");
		} else {
			System.out.println("Array is not mirror like");
		}
	}

}
