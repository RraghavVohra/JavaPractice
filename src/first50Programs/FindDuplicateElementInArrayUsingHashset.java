package first50Programs;

import java.util.HashSet;

public class FindDuplicateElementInArrayUsingHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {3,4,5,3,6,4}; // Length = 6
		
		HashSet<Integer> hset = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			
			if(hset.add(a[i])==false){
				
				System.out.println(a[i]+ " is duplicated in the array");
				
			}
			
		}
	}

}
