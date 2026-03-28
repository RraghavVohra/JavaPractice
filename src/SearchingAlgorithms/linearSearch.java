package SearchingAlgorithms;

public class linearSearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] nums = {23,45,1,2,8,19,-3,16,-11,28};
		int target = 19;
		int ans = linearSearchh(nums,target);
		boolean answer = linearSearchhh(nums,target);
		System.out.println(ans);
		System.out.println(answer);
	}
		
		// Search in the array : return the index if item found otherwise
		// if item not found return -1
		
		static int linearSearchh(int[] arr,int target) {
			
			if(arr.length==0) {
				
				return -1;
			}
			
			// Run a for loop
			for(int i=0;i<arr.length;i++) {
				
				int element = arr[i];
				if(element == target) {
					
					return i;
				}
			}
			// This line will execute if none of the return statements above
						// have executed. Hence, target not found.
						return -1;	
		}		
	
	 // SECOND WAY : Search the target and return true or false
	 static boolean linearSearchhh(int[] arr,int target) {
		 
		 if(arr.length == 0) {
			  
			 return false;
		 }
		 
		 // Run a For-Each loop
		 for(int element : arr) {
			 if(element == target) {
				 
				 return true;
			 }
		 }
		 
		 // This line will execute if none of the return statements above have executed 
		 // Hence, the target is not found.
		 return false;
	 }
			}

