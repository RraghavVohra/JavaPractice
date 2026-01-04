package first50Programs;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number:");
        int num = scanner.nextInt();
        
        // Logic for finding the factorial
        int fact= factorial(num);
        scanner.close();
        System.out.println("Factorial of the given number"+num+"is:"+fact);
	}
        public static int factorial(int n) {
        	
        	if(n==0) {
        		return 1;
        	}else {
        		return n*factorial(n-1);
        	}
        }
	}

