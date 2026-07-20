package normalImportantQuestions;

public class reverseOneWordFromSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Deloitte Interview Question
		String sentence = "I am Raghav Vohra";
		String targetWord = "Raghav";
		
		char[] chars = sentence.toCharArray();
		// Since we have to reverse only one word, so we need to know it's
		// starting and ending index
		int startIndex = sentence.indexOf(targetWord); // 5
		int endIndex = startIndex + targetWord.length() - 1; // 5 + 6 -1 
		
		int left = startIndex;
		int right = endIndex;
		
		while(left<right) {
			
			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;
			left++;
			right--;
		}
		
		// Converting the entire array to string
		System.out.println(new String(chars));

	}

}
