package SearchingAlgorithms;

public class maxSubArrayWithSlidingWindowTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,1,5,1,3,2};
		int k = 3;
		
		System.out.println(maxSum(arr,k));

	}
	
	static int maxSum(int[] arr,int k) {
		
		int windowSum = 0;
		int maxSum = 0;
		int start = 0;
		for(int end = 0; end < arr.length; end++) {
			
			windowSum = windowSum + arr[end];
			
			if(end >= k-1) {
			   maxSum = Math.max(maxSum, windowSum);
			   windowSum = windowSum - arr[start];
			   start++;
			}
		}
		return maxSum;
		}

}
