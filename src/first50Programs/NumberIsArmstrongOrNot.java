package first50Programs;

import java.util.Scanner;

public class NumberIsArmstrongOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number"); // 153
		int num = scanner.nextInt();
		int originalNum = num;
		scanner.close();
		
		int cubedNum = 0;
		
		while(num>0) {
			
			int remainder = num%10; // 153%10 -> 3
			cubedNum = cubedNum + (remainder*remainder*remainder); // 27
			num = num/10; // 153/10 -> 15
		}
		
		if(originalNum==cubedNum) {
			
			System.out.println(originalNum+" is an Armstrong number");
		}else {
			System.out.println(originalNum+" is not an Armstrong number");
		}
	}

}
