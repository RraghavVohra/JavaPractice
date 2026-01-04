package first50Programs;

import java.util.Scanner;

public class ProgramSix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		System.out.println("Input your number:");
		int n = scanner.nextInt();
		for(int i=1;i<=10;i++) {
			
			System.out.println(n + " x " + i + " = " + (n * i));

		}
		
		scanner.close();
		
	}

}

// For Loop -> Initialization > condition > update
// 
