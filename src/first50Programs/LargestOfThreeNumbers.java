package first50Programs;

import java.util.Scanner;

public class LargestOfThreeNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner =  new Scanner(System.in);
		System.out.println("Enter first number:");
		int a = scanner.nextInt();
		System.out.println("Enter second number:");
		int b= scanner.nextInt();
		System.out.println("Enter third number:");
		int c = scanner.nextInt();
		scanner.close();
		
		// Logic for finding the largest of given three numbers
		if(a>b && a>c) {
			
			System.out.println(a+" is the largest of given three numbers");
		}else if(b>c) {
			
			System.out.println(b+" is the largest of given three numbers");
		}else {
			System.out.println(c+" is the largest of given three numbers");
		}
	}

}
