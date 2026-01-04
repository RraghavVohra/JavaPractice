package first50Programs;

public class ReverseAString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Alexander";
		// Converting String to Character array
		char[] ca = str.toCharArray(); // [A,l,e,x,a,n,d,e,r]
		int size = ca.length; // 9
		// Size is 9 and indexing starts from 0
		// So when we say size-1, we are referring to last character i.e. r
		// which is at index 8
		String reversedString = "";
		
		for(int i=size-1;i>=0;i--) {
			
			reversedString = reversedString + ca[i]; 
		}
		
		System.out.println(reversedString);
	}

}
