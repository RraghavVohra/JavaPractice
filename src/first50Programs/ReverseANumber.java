package first50Programs;

import java.util.Scanner;

public class ReverseANumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		scanner.close();
		
		// Logic for reversing the number
		int reversednum = 0;
		
		while(num>0) {
			
			int remainder = num%10; // 1234%10 = 4
			reversednum = (reversednum*10) + remainder; // 0+4 = 4
			num = num/10; // 1234/10 = 123
		}
		
		System.out.println("The reversed number is:"+reversednum);
	}

}
