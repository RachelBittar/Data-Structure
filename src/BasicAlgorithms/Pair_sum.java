package BasicAlgorithms;

import java.util.Arrays;

public class Pair_sum {

	public static void main(String[] args) {
		
		int []arr = {1, 2, 7, 8, 15};
	    int target = 9;
	   	
		 pair_sum(arr,target);
		 System.out.print(Arrays.toString( pair_sum(arr,target)));
		
}
	
	private static int[] pair_sum(int[] arr, int target) {
		
		   // sort the list
			Arrays.sort(arr);
			int[] e = {0,0};
		    
		   // initialize two pointer - one from start of the array and other from the end
		    int front_index = 0;
		    int back_index = arr.length - 1;

		    // shift the pointers
		    while (front_index < back_index) {
		    	int front = arr[front_index];
		    	int back = arr[back_index];

		        if (front + back == target) {
		        	e[0]=front;
		        	e[1]=back;		
		            return e;
		        }
		        
		        if (front + back < target)       // sum < target ==> shift front pointer forward
		            front_index ++; 
		        else
		            back_index --;               // sum > target ==> shift back pointer backward
		    }
		    
		    return e;
		
	}
		
	
	
}
