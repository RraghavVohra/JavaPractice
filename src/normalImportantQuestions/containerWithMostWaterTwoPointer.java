package normalImportantQuestions;

public class containerWithMostWaterTwoPointer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        System.out.println(mostWater(height));
	}
	
	public static int mostWater(int[] height) {
		
		int left = 0;
		int right = height.length-1;
		int maxWater = 0;
		
		while(left<right) {
			
			// Current water calculate karo
			int water = Math.min(height[left],height[right])*(right-left);
			// maxWater update karo
			maxWater = Math.max(maxWater,water);
			// Chhoti Wall move karo
			if(height[left]<height[right]) {
			   left--;
			} else {
				right--;
			}
			
		}
		
		return maxWater;
		
		
	}
	
}

