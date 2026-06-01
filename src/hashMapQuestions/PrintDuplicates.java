package hashMapQuestions;

import java.util.HashMap;
import java.util.Map;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] arr = {1,2,3,2,4,3,5};
		printDuplicates(arr);
	}
	
	static void printDuplicates(int[] arr) {
		
		// STEP 1 : FREQUENCY MAP BANAO
		HashMap<Integer,Integer> freq = new HashMap<>();
		
		// STEP 2 : ARRAY ITERATE KARO FREQUENCY COUNT KARO
		for(int i=0;i<arr.length;i++) {
			
			if(freq.containsKey(arr[i])==false) {
				
				freq.put(arr[i],1);
			} else {
				
				freq.put(arr[i],freq.get(arr[i]+1));
			}
		}
		
	  // STEP 3 : MAP ITERATE KARO! Count > 1 = DUPLICATE
	  for(Map.Entry<Integer,Integer> entry : freq.entrySet()) {
		  // Map.Entry = ek key-value pair
		  // entry = Current Pair 
		  // freq.entrySet = Jahan se hum le rahe ek key-value pair ko. THIS IS JUST A FOR EACH LOOP
		  
		  if(entry.getValue()>1) {
			  
			  System.out.println("Duplicate: "+entry.getKey());
		  }
	  }
	}

}
