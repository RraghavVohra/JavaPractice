package normalImportantQuestions;

public class findTheSecondLargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {3,7,1,9,4,6};
		secondLargest(arr);
	}
	
	static void secondLargest(int[] arr) {
		
		int first = Integer.MIN_VALUE;
		int second = Integer.MIN_VALUE;
		
		for(int i=0; i<arr.length; i++) {
			
			if(arr[i]>first) {
				
				second = first;
				first = arr[i];
			} else if(arr[i]>second && arr[i]!=first) {
				
				second = arr[i];
			}
		}
		
		System.out.println("2nd Largest element is:" +second);
	}

}
