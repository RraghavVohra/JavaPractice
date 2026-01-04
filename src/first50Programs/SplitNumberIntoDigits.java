package first50Programs;

import java.util.Scanner;

public class SplitNumberIntoDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Take input from the User
		// Convert the Integer to String
		// Use a loop to iterate over the string
		// Print each character(digit) individually
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		String number = sc.nextLine();
		
		//Now we will loop through each character
		System.out.print("Digits are: ");
		
		for(int i=0;i<number.length();i++) {
			
			System.out.print(number.charAt(i)+" ");
		}
		
		sc.close();
	}

}
