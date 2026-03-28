package first50Programs;

public class FindDuplicatesInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {100,200,100,300,100,400,100,200,300};
		
		int num = 300;
		int count = 0;
		
		for(int value : a) {
			
			if(value == num) {
				
				count++;
			}
		}
		
		System.out.println(count);
	}

}
