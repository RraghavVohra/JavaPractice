package normalImportantQuestions;

public class findTheLargestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {3,7,1,9,4,6};
		findLargest(arr);
		
	}
	
	static void findLargest(int[] arr) {
		
	
		int max = arr[0];
		for(int i=1;i<arr.length;i++) {
			
			if(arr[i]>max) {
				
				max = arr[i];
			}	
		}
		System.out.println("Largest: "+max);
	}
}

// Why we wrote static?

// The reason for static is simple:
// main() is static → it can only directly call other static methods.
// main runs without creating an object of the class. So when it calls findLargest(arr), 
// that method must also be static — otherwise Java would complain, because a non-static method belongs 
// to an instance (object), and no object exists at that point.
// Think of it this way:
// static method = belongs to the class itself
// non-static method = belongs to an object of the class
// Since main has no object, it can't reach non-static methods directly.


// If you're calling a method directly from main without creating an object, that method must be static.
// IF YOU WOULD HAVE WRITTEN 
// findTheLargestElement obj = new findTheLargestElement();
// obj.findLargest(arr);

// …then static on findLargest wouldn't be needed. 
// But since you called it bare as findLargest(arr), static is required.


















