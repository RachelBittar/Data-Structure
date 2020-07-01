package sort;

import java.util.Arrays;

/*
 * Write a function flip(arr, k) that reverses the order of the first k elements
in the array arr.
Write a function pancakeSort(arr) that sorts and returns the input array. You are allowed to use only the function flip you wrote in the first step in order to make changes in the array.
Example:
				j j+1
input:  arr = [1, 5, 4, 3, 2]
output: [1, 2, 3, 4, 5] # to clarify, this is pancakeSort's output
Analyze the time and space complexities of your solution.

*/
public class PancakeSort {
	
	static int pancakeSort(int[] arr) {
		
		int j=0;
		int count =0;
		int n=arr.length-1;
		int next=0;
		int current =0;
		System.out.println(Arrays.toString(arr));
		
		for(int i=0; i<=n;i++) {
			
			current = arr[i];
			next    = (arr[i+1]);
			
			if(current+1 != next) {			
				arr = reverse(arr,(i+1),n);
			}
		}
		
		return 0;
	  }

    
	private static int[] flip(int[] arr, int from) {
    	
		  
    	int[] a = new int[arr.length];
    	a = reverse(arr,from,arr.length);
    	a = reverse(arr,0,from);
    	Arrays.toString(a);
    	return a;
    	
    	
	}
	
	
	
    private static int[] reverse(int[] arr, int from, int to) {
    	
  
    	int[] a = new int[arr.length];
    	int n = arr.length-1;
		
    	for(int i=0; i<arr.length;i++) {
    		if(i<from)
    			a[i]= arr[i];	
    		else
    			a[i]= arr[arr.length-i];	
    	}
    	System.out.println(Arrays.toString(a));
    	return a;
    	
    	
	}
    

	public static void main(String[] args) {
    	
    	int[] arr = {3, 2, 4, 1};		
		 System.out.println("Number of flips: "+pancakeSort(arr)); 
		     
		 }
}
