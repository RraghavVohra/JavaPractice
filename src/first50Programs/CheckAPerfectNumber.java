package first50Programs;

import java.util.Scanner;

public class CheckAPerfectNumber {
	
	// Perfect Number = sum of proper divisors
	// 6 -> 1+2+3 = 6
	// We have to exclude the number itself
	
	// Method to check if a number is perfect
	public static boolean isPerfect(int number) {
		
		int sum = 0;
		// Find all the proper divisors (less than the number)
		for(int i=1;i<number;i++) {
			
			if(number%i == 0) {
				
				sum = sum + i;
			}
		}
		// Check if sum of proper divisors equals the number
		return sum  == number;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = sc.nextInt();
		
		if(isPerfect(num)) {
			
			System.out.println(num + "is a Perfect number.");
		}else {
			
			System.out.println(num + "is not a Perfect number.");
		}
		
		sc.close();
	}

}
