package first50Programs;

import java.util.Scanner;

public class SumOfAllDigitsInGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 5124/10 = 512  we get quotient
		// 5124%10 = 4 modulo gives us remainder
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any digit number:");
		int number = scanner.nextInt();
		scanner.close();
		
		int sum = 0;
		
		while(number!=0) {
			
			int digit = number%10; // Get the last digit 
			sum = sum + digit;
			number = number/10; // Remove the last digit
		}
		
		System.out.println("The sum of the digit is:" +sum);
	}

}
