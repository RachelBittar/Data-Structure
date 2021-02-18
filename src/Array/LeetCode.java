package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LeetCode {
	
	
	public static void reverseString(char[] s) {

		if ((s == null) || (s.length <= 0))
			System.out.println(s);
		else {
			System.out.print(s[(s.length - 1)] + " ");
			s = Arrays.copyOfRange(s, 0, s.length - 1);
			reverseString(s);
		}

	}
	
	//{1,2,3,4,5};
	 public static int[] runningSum(int[] nums) {
		 
	  for (int i = 1; i < nums.length; i++) {
	         nums[i] = nums[i]+ nums[i - 1];
	         System.out.println("Num ["+i+"] " + nums[i]);
	  }
	     				
		 return nums;
	 }

	 
	 
	 public static int arrayPairSum(int[] nums) {
		 Arrays.sort(nums);

	        int sum = 0;
	        for( int i = 0; i < nums.length; i = i + 2 )
	            sum += nums[i];

	        return sum;
	  }
	 
	 
	 
	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		    int max = Integer.MIN_VALUE;
		    
		    for (int candy : candies) {
		      max = Math.max(max, candy);
		    }
		    
		    List<Boolean> list = new ArrayList<>();
		    
		    for (int i = 0; i < candies.length; i++) {
		    	list.add((candies[i] + extraCandies) >= max);
		    }
		    return list;
		  }
		  
		  
	 
	 public static int[] plusOne(int[] digits) {
		 
			
			for(int i=digits.length-1; i>=0;i--) {
				
				if((digits[i]<9)) {
				    digits[i]++;
					return digits;
				}		
				digits[i]=0;
			}
			
			
			int[] result = new int[digits.length+1];
			result[0]=1;
			result[result.length-1] =0;
			
			return result;
	    }
	 
	 
	 public static int thirdMax(int[] nums) {
		
		  int index = 0;
	      long[] result = {Long.MIN_VALUE, Long.MIN_VALUE, Long.MIN_VALUE};

	        for (int i = 0; i < nums.length; i++) {
	        	
	            if (nums[i] > result[0]) {
	                result[2] = result[1];
	                result[1] = result[0];
	                result[0] = nums[i];
	                index++;
	                
	            } else if (nums[i] > result[1] && nums[i] < result[0]) {
	                result[2] = result[1];
	                result[1] = nums[i];
	                index++;
	                
	            } else if (nums[i] > result[2] && nums[i] < result[1]) {
	                result[2] = nums[i];
	                index++;
	            }
	        }
	        return index > 2 ? (int)result[2] : (int)result[0];
	    }
	
	        
	

	public static void main(String[] args) {
		
		//List<Boolean> result = new ArrayList<>();
		
		//char[] array = {'R','A','C','H','E','L'} ;
		//reverseString(array);
		
		//int[] nums = {1,2,3,4,5};
		//System.out.println(Arrays.toString(runningSum(nums)));
		
		//int[] nums = {1,4,3,2};
		//System.out.println(arrayPairSum(nums));
		
		//int[] nums = {3,2,1};
		//result = kidsWithCandies(nums,1);
		
		//int[] nums = {10};
		
		//int[] result = plusOne(nums);
		//System.out.println(Arrays.toString(result));
		
		int[] nums = {2,2,3,1};
		int result= thirdMax(nums);
		System.out.println((result));
	}

}
