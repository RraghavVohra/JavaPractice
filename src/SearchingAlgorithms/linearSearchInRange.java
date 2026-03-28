package SearchingAlgorithms;

public class linearSearchInRange {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Search for 3 in range of index [1,4]
		
		int[] arr = {18,12,-7,3,14,28};
		int target = 3;
		System.out.println(linearSearch(arr,target,1,4));
		
	}
	
	static int linearSearch(int[] arr,int target,int start,int end) {
		
		if(arr.length == 0) {
			
			return -1;
		}
		
		// Run a for loop
		for(int index=start; index<=end; index++) {
			
			// check for element at every index if it is equal to target
			int element = arr[index];
			if(element == target) {
				
				return index;
			}
		}
		
		// This line will execute if none of the return statements above have executed.
		// Hence, target not found.
		return -1;
	}

}
