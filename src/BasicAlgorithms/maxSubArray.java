package BasicAlgorithms;

/*
           
Problem Statement

You are given an array 'arr' having 'n' integers. 
You have to find the maximum sum of contiguous subarray among all the 
possible subarrays. 

This problem is commonly called as [Maximum Subarray Problem]
Solve this problem in *O(nlogn)* time, using Divide and Conquer approach.
          
**Example 1**
      
Input: arr = [-2, 1, -3, 5, 0, 3, 2, -5, 4],
Output: Maximum Sum = 10 for the  subarray = [5, 0, 3, 2],
           
**Example 2**,
Input: arr = [-2, -5, 6, -2, -3, 1, 5, -6],
Output: Maximum Sum = 7  for the  subarray = [6, -2, -3, 1, 5]
          
***As of now, let's not return the subarray itself.***
           
    The Idea,
    Divide the given array into three subarray w.r.t. the middle,
    say Left, Right, and Cross subarrays. 
     
    Recurse on the Left part, and Right part until you reach the base
    condition, i.e. single element in a subarray. 
   
    Calculate the ***maximum sum*** of the Left, Right, 
    and Cross subarrays, say L, R, and C respectively.
     
    **Return the maximum of L, R, and C.**
  
    //////// Logic to Calculate C, the Maximum sum of a Cross Subarray.
     
Start from the middle index, and traverse (sum the elements) in the left 
direction.
Keep track of the maximum sum on the left part, say leftMaxSum. 
Similarly, start from the (middle +1) index, and traverse 
(sum the elements) in the right direction. 
Keep track of the maximum sum on the right part, say rightMaxSum.
Return the (leftMaxSum + rightMaxSum), as C. 
The following exmaple would help you imagine the solution better,

      
*/


public class maxSubArray {

	public static void main(String[] args) {
		
		int[] arr = {-2, 1, -3, 5, 0, 3, 2, -5, 4};
		
		System.out.print(maxSubArrayRecursive(arr,0, arr.length-1));

	}

	private static int maxSubArrayRecursive(int[] arr, int start, int stop) {
		
	 // Base case
	  if (start==stop) {
	        return arr[start];
	  }

	  if(start < stop) {
	     int mid = (stop+start)/2;     
	     
	     int L =  maxSubArrayRecursive(arr, start, mid); 
	     System.out.print("L "+ L+ " ");
	     
	     int R =  maxSubArrayRecursive(arr, mid+1, stop); 
	     System.out.print("R "+ R + " ");	
	     
	     int C = maxCrossingSum(arr, start, mid, stop);
	     System.out.print("C " + C + " ");
	       
	     System.out.println();														// Find the max crossing sum w.r.t. middle index
	       return Math.max(C, Math.max(L,R)) ;                        // Return the maximum of (L,R,C)
	    }
	    else                                                 		  // If ever start > stop. Not feasible. 
	       return arr[start];
		
	}


	private static int maxCrossingSum(int[] arr, int start, int mid, int stop) {
	
		 int sum = 0;
	     int left_sum = Integer.MIN_VALUE;
	     
	     for (int i = mid; i>= start; i--) {
	            sum = sum + arr[i];
	            if (sum > left_sum)
	                left_sum = sum;
	     }
	  
	     sum = 0;
	     int right_sum = Integer.MIN_VALUE;
	     
	     for (int i = mid + 1; i <= stop; i++) {
	            sum = sum + arr[i];
	            if (sum > right_sum)
	                right_sum = sum;
	      }
	 
	    return Math.max(left_sum + right_sum, Math.max(left_sum, right_sum));

	}
}
