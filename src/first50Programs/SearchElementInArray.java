package first50Programs;

public class SearchElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {10,20,40,50};
		
		int search_element = 30;
		
		boolean found = false;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i] == search_element) {
				
				found = true;
				break;
			}
		}
		
		 if (found) {
	            System.out.println("Element found");
	        } else {
	            System.out.println("Element not found");
	        }

	}

}
