package first50Programs;

import java.util.Arrays;

public class FindMaxAndMinInArrayWayTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numbers = {34, 12, 56, 78, 2, 89, 3, 99, 1};
		
		Arrays.sort(numbers); // Arranging them in Ascending order
		
		int min = numbers[0]; // First element is the smallest
		int max = numbers[numbers.length-1]; // Last element is the largest
		
		System.out.println("Minimum number in array: " + min);
        System.out.println("Maximum number in array: " + max);
	}

}
