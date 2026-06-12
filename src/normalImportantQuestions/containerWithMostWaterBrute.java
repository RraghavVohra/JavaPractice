package normalImportantQuestions;

public class containerWithMostWaterBrute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
		System.out.println(mostWater(height));
		
	}
	
	public static int mostWater(int[] height) {
		
		int maxWater = 0;
		
		for(int i=0;i<height.length;i++) {
			for(int j=i+1;j<height.length;j++) {
				
				int water = Math.min(height[i],height[j])*(j-i);
				maxWater = Math.max(maxWater, water);
				
			}
		}
		
		return maxWater;
	}

}
