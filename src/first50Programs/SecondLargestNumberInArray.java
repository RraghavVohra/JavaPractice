package first50Programs;

public class SecondLargestNumberInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// We need to know two things at all times
		// 1.The Largest Number found so far
		// 2.The Second Largest Number found so far
		
		int[] arr = {10,5,20,8,15}; // length = 5
		
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++) {
			
			if(arr[i] > firstLargest) {
				
				// Current number is bigger than our first largest so shift the 
				// firstLargest down to secondLargest
				secondLargest = firstLargest;
				firstLargest = arr[i];
			} else if(arr[i]>secondLargest && arr[i]<firstLargest) {
				
				// Current number is between first & second
				secondLargest = arr[i];
			}
		}
		
		System.out.println("First Largest: "+firstLargest);
		System.out.println("Second Largest: "+secondLargest);
		
	}

}
