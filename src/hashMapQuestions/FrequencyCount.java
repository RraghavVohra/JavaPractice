package hashMapQuestions;

import java.util.HashMap;

public class FrequencyCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String input = "aabbbcc";
		getFrequency(input);

	}
	
	static void getFrequency(String s) {
		
		HashMap<Character,Integer> freq = new HashMap<>();
		
		for(char c : s.toCharArray()) {
			
			if(freq.containsKey(c)) {
				
				freq.put(c,freq.get(c)+1);
				
			} else {
				
				freq.put(c,1);
			}
		}
		
		System.out.println(freq);
	}

}
