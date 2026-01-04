package first50Programs;

public class PrintOddAndEvenNumbersIntheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ar[] = {6,1,2,4,7,5,9};
		System.out.println("The below are the even numbers available in this array:");
		
		for(int e : ar) {
			
			if(e%2==0) {
				
				System.out.println(e+" ");
			}
		}
		
		System.out.println();
		
		System.out.println("The below are the odd numbers available in this array:");
		
		for(int e:ar) {
			
			if(e%2!=0) {
				
				System.out.println(e+" ");
			}
		}
	}
	

}
