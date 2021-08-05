package Array;

import java.util.Arrays;

public class Shuffle {

	public static int[] shuffle(int[] nums, int n) {
		
		
		//   0   1   2   3   4   5   
		// | 2 | 5 | 1 | 3 | 4 | 7 |
		// | 2 | 3 | 5 | 4 | 1 | 7 |
		//   0   3   1   4   2   5
		
		 int i = 0, j = n, o = 0;
	     int[] ans = new int[nums.length];
	        
	        while (o < nums.length) {
	            ans[o++] = nums[i++];
	            ans[o++] = nums[j++];            
	        }
	        
	        return ans;
		
	       
	}
	public static void main(String[] args) {
		
		int[] nums = {2,5,1,3,4,7};
		int n = 3;
		
		int[] r = shuffle(nums, n);
		
		System.out.print(Arrays.toString(r));
		
	}

}
