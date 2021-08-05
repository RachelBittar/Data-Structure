package Array;

import java.util.Arrays;

public class RunningSum {

	public static int[] runningSum(int[] nums) {
         for (int i = 1; i < nums.length; i++) {
        	 nums[i] += nums[i - 1];
	   }
         
         return nums;	        
}

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {1,2,3,4};
		
		int[] r = runningSum(array);
		
		System.out.print(Arrays.toString(r));
	}

}
