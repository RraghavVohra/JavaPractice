package first50Programs;

public class FindingMissingElementInTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4,6};
		
		int sumWithoutMiss = 0;
		for(int i=1;i<=6;i++) {
			
			sumWithoutMiss = sumWithoutMiss + i;  
		}
		
		// Sum With Miss
		int sumWithMiss = 0;
		for(int e : a) {
			
			sumWithMiss = sumWithMiss + e;
		}
		
		System.out.println("The missing element in the array is: "+(sumWithoutMiss-sumWithMiss));
	}

}
