package first50Programs;

public class CheckArrayIsSortedOrNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// We will compare each element with its next element (to the right).
		// If the current element is greater than the next, that means
		// the array is unsorted.
		
		int[] arr = {1,2,1,4,5};
		boolean isSorted = true;
		
		for(int i=0; i<arr.length-1;i++) {
			
			if(arr[i] > arr[i+1]) {
				
				// Comparing current with next
				isSorted = false;
				break;
			}
		}
		
		if(isSorted) {
			System.out.println("Array is sorted in ascending order.");
		} else {
			System.out.println("Array is not sorted.");
		}
		
	}

}
