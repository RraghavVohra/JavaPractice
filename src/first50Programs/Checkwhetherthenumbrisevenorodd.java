package first50Programs;

import java.util.Scanner;

public class Checkwhetherthenumbrisevenorodd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your number:");
		
		int a = scanner.nextInt();
		
		if(a%2==0) {
			
			System.out.println("Given number "+a+" is an even number");
		}
		
		else {
			System.out.println("Given number "+a+" is an odd number");
		}
		
		scanner.close();
	}

}

// Writing the logic without scanner class

// int a = 10;
// if(a%2==0){
// System.out.println(a+" is even. ");
// }
// else{
// System.out.println(a+" is odd. ");
// }
