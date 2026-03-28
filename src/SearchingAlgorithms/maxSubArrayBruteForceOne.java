package SearchingAlgorithms;

public class maxSubArrayBruteForceOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] arr = {2,1,5,1,3,2};
        int maxSum = 0;
        
        for(int i=0; i<arr.length-2; i++) {
        	
        	int currentSum = arr[i] + arr[i+1] + arr[i+2];
        	
        	if(currentSum > maxSum) {
        		
        		maxSum = currentSum;
        	}
        }
        
        System.out.println(maxSum);
	}

}
