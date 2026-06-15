package normalImportantQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class threeSum {

	// FIND ALL UNIQUE TRIPLETS THAT SUM TO ZERO 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int[] nums = {-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
        }
	
	// OUTER LOOP : EK ELEMENT FIX KARO -> nums[i]
	// INNER LOOP : TWO POINTERS -> L=i+1, R=end
	// LEFT + RIGHT + nums[i] = 0
	// 0 - nums[i] = LEFT + RIGHT
	// Target = 0 - nums[i]
	   
	 public static List<List<Integer>> threeSum(int[] nums){
		 
		 List<List<Integer>> result = new ArrayList<>();
		 // Sorting the Array
		 Arrays.sort(nums);
		 
		 for(int i=0;i<nums.length-2;i++) {
		 // WE WROTE nums.length-2, as we need atleast two elements after i. As we have two pointers.
	     int left = i+1;
	     int right = nums.length-1;
	     int target = 0 - nums[i];
	     
	     while(left<right) {
	    	 int sum = nums[left] + nums[right];
	    	 if(sum>target) {
	    		 right--;
	    	 } else if(sum<target) {
	    		 left++;
	    	 } else {
	    		 result.add(Arrays.asList(nums[i],nums[left],nums[right]));
	    	 }
	    	 
	    	 // DUPLICATE LEFT SKIP KARO
	    	 while(left<right && nums[left]==nums[left+1]) {
	    		 left++;
	    	 }
	    	 
	    	 // DUPLICATE RIGHT SKIP KARO
	    	 while(left<right && nums[right]==nums[right-1]) {
	    		 right--;
	    	 }
	    	 
	    	 left++;
	    	 right--;
	     }
		 }
		 
		 return result;
	 }

}


// EXPLANATION
// Index:  0   1  2  3  4  5
// nums: [-2,  0, 0, 0, 2, 2], fix = -2,target = 2
//             L           R
// nums[left] i.e. nums[1] = 0 and nums[right] i.e. nums[5] = 2
// 0 + 2 = 2 == target
// result = [[-2,0,2]]

// Ab duplicate skip start hota hai — LEFT side:
// L=1 → nums[1]=0, nums[2]=0 → same → left++
// L=2 → nums[2]=0, nums[3]=0 → same → left++
// L=3 → nums[3]=0, nums[4]=2 → different → STOP

// L ab 3 pe hai
// Matlab — saare duplicate 0 skip ho gaye left side se.

// Ab duplicate skip — RIGHT side:
// R=5 → nums[5]=2, nums[4]=2 → same → right--
// R=4 → nums[4]=2, nums[3]=0 → different → STOP

// R ab 4 pe hai
// Matlab — saare duplicate 2 skip ho gaye right side se.

// Ab actual move:
// left++;
// right--;
// L=3 → L=4
// R=4 → R=3

// L > R → while loop band
























