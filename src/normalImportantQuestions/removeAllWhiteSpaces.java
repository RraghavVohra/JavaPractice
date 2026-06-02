package normalImportantQuestions;

public class removeAllWhiteSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hello World How Are You";
		System.out.print(removeSpaces(s));
	}
	
  	static String removeSpaces(String s) {
  		
  		String result = " ";
  		for(int i=0;i<s.length();i++) {
  			
  			if(s.charAt(i)!=' ') {
  				
  				result = result + s.charAt(i);
  			}
  		}
  		
  		return result;
  	}

	
}
