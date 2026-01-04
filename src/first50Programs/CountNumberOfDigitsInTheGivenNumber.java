package first50Programs;

import java.util.Scanner;

public class CountNumberOfDigitsInTheGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any digit number:");
		int num = scanner.nextInt(); // 153
		// Logic
		int digitCount = 0;
		scanner.close();
		while(num>0) {
			
			digitCount++; // 1->2->3
			num = num/10; // 153/10 = 15, 15/10 = 1, 1/10 = 0
		}
		
		System.out.println("The number of digits in the given number is: "+digitCount);
	}

}
