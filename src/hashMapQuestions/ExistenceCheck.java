package hashMapQuestions;

import java.util.HashSet;

public class ExistenceCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,2,4};
		System.out.println(hasDuplicate(arr));
		
	}
	
	public static boolean hasDuplicate(int[] arr) {
		
		HashSet<Integer> seen = new HashSet<>();
		
		for(int num : arr) {
			
			if(seen.contains(num)) {
				
				return true;
			}
			
			seen.add(num);
		}
		
	   return false;	
	}

}
