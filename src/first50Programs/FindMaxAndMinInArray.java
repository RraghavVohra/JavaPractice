package first50Programs;

public class FindMaxAndMinInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int [] a = {8,1,5,9,12,33,23,7,4,3}; // Length = 10
		
		int max = a[0];
		int min = a[0];
		
		for(int i=0;i<a.length;i++) {
			
			// 0
			
			if(max<a[i]) {
				
				max=a[i];
			}
			
			if(min>a[i]) {
				
				min=a[i];
			}
			
		}
		
		System.out.println("The max number in the given array is:"+max);
		System.out.println("The min number in the given array is:"+min);

}
	}
