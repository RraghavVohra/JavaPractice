package SearchingAlgorithms;

public class maxSubArrayBruteForceTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {2,1,5,1,3,2};
        int maxSum = Integer.MIN_VALUE;
        
        for(int i=0; i<arr.length-3; i++) {
        	
        	int sum = 0;
        // Sum of Three consecutive elements
          for(int j=i; j<i+3; j++) {
        	  
        	  sum = sum + arr[j];
          }
          
          maxSum  = Math.max(maxSum, sum);
        }
        
        System.out.println(maxSum);
	}

}
