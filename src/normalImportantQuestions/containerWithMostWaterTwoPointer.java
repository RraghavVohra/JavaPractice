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

// L=0, R=8
// Pehle: height[0]=1, height[8]=7
// water = min(1,7) × (8-0) = 1 × 8 = 8
// maxWater = Math.max(0,8) = 8
// height[L]=1 < height[R]=7 → left++
// Ab: L=1, R=8

// L=1, R=8
// Pehle: height[1]=8, height[8]=7
// water = min(8,7) × (8-1) = 7 × 7 = 49
// maxWater = Math.max(8,49) = 49
// height[L]=8 > height[R]=7 → right--
// Ab: L=1, R=7




























