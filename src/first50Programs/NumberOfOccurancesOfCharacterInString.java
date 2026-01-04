package first50Programs;

public class NumberOfOccurancesOfCharacterInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// APPROACH 1
		String str = "Arun Motoori";
		int beforelength = str.length(); // 12
		
		String str2 = str.replace("o","");
		int afterlength = str2.length(); // 9
		
		System.out.println("The number of time o has occured in the given string text is: "+(beforelength-afterlength));
		
		// APPROACH 2
		char ca[] = str.toCharArray();
		// ca[] = {'A','r','u','n',' ','M','o','t','o','o','r','i'}
		int count = 0;
		
		for(int i=0;i<ca.length;i++) {
			
			if('o'==ca[i]) {
				
				count++;
			}
			
		}
		
		System.out.println("The number of occurances of the character o in the given string text is:"+count);
		
	}

}
