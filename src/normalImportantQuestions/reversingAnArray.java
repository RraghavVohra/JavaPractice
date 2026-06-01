package normalImportantQuestions;

public class reversingAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[] = {1,3,7,8,9};
		reverseArray(arr);
	}
	
	static void reverseArray(int arr[]) {
		
		int start = 0;
		int end = arr.length-1;
		
		while(start<end) {
			
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
		}
		
		start++;
		end--;
	}
	
	

}
