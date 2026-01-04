package first50Programs;

public class SumOfAllElementsInTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ar = {6,3,4,2,7,9,5};
		int sum = 0;
		
		for(int e : ar) {
			
			sum = sum + e; // sum = 6 -> sum = 6+3 = 9 -> and so on
		}
		
		System.out.println("The sum of all the elements in the given array is: "+sum);	
		
	}

}
