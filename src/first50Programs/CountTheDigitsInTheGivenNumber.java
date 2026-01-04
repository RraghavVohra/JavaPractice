package first50Programs;

import java.util.Scanner;

public class CountTheDigitsInTheGivenNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		
		// Logic
		int sumOfDigits = 0;
		scanner.close();
		while(num>0) {
			
			int remainder = num%10; // 153%10 = 3, 15%10 = 5, 1%10 = 1
			sumOfDigits = sumOfDigits + remainder; // 0+3 = 3, 3+5 = 8, 8+1 = 9
			num = num/10; // 153/10 = 15, 15/10 = 1, 1/10 = 0 and the loop ends
		}
	}

}
