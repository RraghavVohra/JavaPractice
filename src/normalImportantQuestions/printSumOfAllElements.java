package normalImportantQuestions;

public class printSumOfAllElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,7,1,9,4,6};
		
	}
	
	static void findSum(int[] arr) {
		
		int sum = 0;
		for(int i=0;i<arr.length;i++){
			
			sum = sum + arr[i];
		}
		
		System.out.println("Final Sum:" + sum);
		
}
}