package first50Programs;

import java.util.Scanner;

public class NumberIsPalindromeOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number:"); // 1991
		
		int originalNumber = scanner.nextInt();
		int number = originalNumber;
		int reversedNumber = 0;
		scanner.close();
		
		// Logic for reversing the given number
		while(number!=0) {
			
			int remainder = number%10; // 1991%10 -> 1
			reversedNumber = (reversedNumber*10)+remainder; // 1
			number = number/10 ; // 1991/10 -> 199
		}
		
		if(originalNumber==reversedNumber) {
			
			System.out.println(originalNumber+ "is a palindrome");
		} else {
			System.out.println(originalNumber+ "is not a palindrome");
		}
	}

}
