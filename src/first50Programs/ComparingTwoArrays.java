package first50Programs;

import java.util.Arrays;

public class ComparingTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] a = {1,2,3,4};
		int[] b = {1,2,3,4};
		
		if(Arrays.equals(a,b)) {
			
			System.out.println("Both the Arrays are equal");
		} else {
			
			System.out.println("The given arrays are not equal");
		}
	}

}
