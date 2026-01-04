package first50Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateArrayWithHashset {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// We will use hashset here, since it does not accept duplicate values
		int [] a = {5,3,4,5,5,4,9,7,6,9}; // length = 10
		
		Set<Integer> set = new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			
			set.add(a[i]);
		}
		
		Integer[] b= set.toArray(new Integer[set.size()]);
		System.out.println(Arrays.toString(b));
		
		
	}

}
