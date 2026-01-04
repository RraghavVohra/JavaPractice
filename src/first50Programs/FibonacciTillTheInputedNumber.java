package first50Programs;

import java.util.Scanner;

public class FibonacciTillTheInputedNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter any number: "); // 50
		
		int number = scanner.nextInt();
		int a = 1;
		int b = 1;
		int f = 0;
		
		while(f<=number) { // 0<50
			
			f=a+b; // 2
			
			if(f>number) // 2 not greater than 50
				break;
			System.out.print(f+" "); // 2
			a=b; // 1
			b=f; // 2 
			
			scanner.close();
			
			// SOLUTION 2
			
			/*Scanner sc = new Scanner(System.in);
			System.out.print("Enter number of terms: ");
			int n = sc.nextInt();
			int c = 0,d=1;
			System.out.print("Fibonacci Series: "+ c + " " +d);
			for(int i = 2;i<n;i++) {
				// Starting from 2 coz 0 & 1 already printed
				int next = c+d; // 0+1
				System.out.print(" "+next);
				c=d;
				d=next;
			*/	
			}
		}
	}


