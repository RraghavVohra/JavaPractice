package first50Programs;

import java.util.Scanner;

public class CountOddAndEvenDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any digit number:"); // 5412
		
		int num = scanner.nextInt();
		scanner.close();
		// Logic for counting the number of even and odd digits in the given number
		
		int evenCount = 0;
		int oddCount = 0;
		
		while(num>0) {
			
			int remainder = num % 10; // 5412%10 = 2, 541%10 = 1, 54%10 = 4,5%10 = 5
			if(remainder%2==0) {
				
				evenCount++;
			}else {
				oddCount++;
			}
			
			num = num/10; // 5412/10 = 541, 541/10 = 54, 54/10 = 5
		}
		
		System.out.println("The number of even digits in the given number is: "+evenCount);
		System.out.println("The number of odd digits in the given number is: "+oddCount);
		
		
	}

}
