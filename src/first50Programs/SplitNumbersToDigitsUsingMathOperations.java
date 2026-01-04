package first50Programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SplitNumbersToDigitsUsingMathOperations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		
		int number = sc.nextInt();
		
		//Store digits in list
		ArrayList<Integer> digits = new ArrayList<>();
		int temp = number; // 786
		
		while(temp>0) {
			
			int digit = temp%10; // % gets us the last digit // 786%10 -> 6 // 78%10 -> 8 // 7%10 -> 7
			digits.add(digit); 
			temp = temp/10; // for removing the last digit // 786/10 -> 78 // 78/10 -> 7 // 7/10 -> 0
		}
		
		// Reverse the list to get the correct order
		
		System.out.println(digits); // [6,8,7]
		Collections.reverse(digits);
		System.out.print("Digits are: ");
		
		for(int digit : digits) {
			
			System.out.print(digit+" ");
		}
		
		sc.close();
	}

}
