package SearchingAlgorithms;

public class maxSubArrayWithSlidingWindowOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] arr = {2,1,5,1,3,2};
        int k = 3;
        
        int windowSum = 0;
        int maxSum = 0;
        
        // STEP 1 : CALCULATE SUM OF FIRST WINDOW
        for(int i=0; i<k; i++) {
        	
        	windowSum  = windowSum + arr[i];
        }
        
        maxSum = windowSum;
        
        // STEP 2 : SLIDE THE WINDOW
        for(int i = k; i<arr.length; i++) {
        	windowSum = windowSum - arr[i-k] + arr[i];
        	maxSum = Math.max(maxSum, windowSum);
        }
        
        System.out.println(maxSum);
        
	}

}
