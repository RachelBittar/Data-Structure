package sort;

import java.util.Arrays;

/*
 * 
 * Counting Inversions,
    
    "The number of *inversions* in a disordered list is the number of pairs of 
    elements that are inverted (out of order) in the list.  \n",
    
    "Here are some examples: ",
    "  - [0,1] has 0 inversions ",
    "  - [2,1] has 1 inversion (2,1)",
    "  - [3, 1, 2, 4] has 2 inversions (3, 2), (3, 1)\n",
    "  - [7, 5, 3, 1] has 6 inversions (7, 5), (3, 1), (5, 1), (7, 1), (5, 3), (7, 3)\n",
    "  
    "The number of inversions can also be thought of in the following manner.,
    "
    "Given an array `arr[0 ... n-1]` of `n` distinct positive integers,
    "for indices `i and j`, if `i < j` and `arr[i] > arr[j]` then the
    "pair `(i, j)` is called an inversion of `arr`.\n",
 
    "## Problem statement\n",
    "Write a function, `count_inversions`, that takes an array (or Python list) 
    as input, and returns a count of the total number of inversions present in 
    the input,
    
    "Mergesort provides an efficient way to solve this problem."
   ]
 * 
 * */


public class CountInversions {

	public static void main(String[] args) {
		
		int []arr = {1,2,3,4,5,6};
		System.out.println((count_inversions(arr)));
	}



	public static int count_inversions(int[] arr) {
		
		int start_index = 0;
		int end_index = arr.length - 1;

		int output = inversion_count_func(arr, start_index, end_index);
		return output;
	}

	public static int inversion_count_func(int[]arr, int start_index, int end_index) {
		
		if (start_index >= end_index)
			return 0;

		int mid_index = start_index + (end_index - start_index) / 2;
		int left_answer = inversion_count_func(arr, start_index, mid_index);
		int right_answer = inversion_count_func(arr, mid_index + 1, end_index);

		int output = left_answer + right_answer;

		output += merge_two_sorted_halves(arr, start_index, mid_index, mid_index + 1, end_index);
		return output;

	}

	public static int merge_two_sorted_halves(int[] arr, 
			int start_one, int end_one,
			int start_two, int end_two) {

		int count = 0;
		int left_index = start_one;
		int right_index = start_two;

		int output_length = (end_two - start_two + 1) 
						  + (end_one - start_one + 1);

		int[] output_list = new int[output_length] ;
		int index = 0;

		while (index < output_length) {
			
			if (arr[left_index] <= arr[right_index]) {
				output_list[index] = arr[left_index];
				left_index += 1;
			}

			else{
				count = count + (end_one - left_index + 1);  
				output_list[index] = arr[right_index];
				right_index += 1;
			}
			index = index + 1;
		
			if (left_index > end_one) {
				for(int i=right_index; i<end_two + 1; i++) {
				output_list[index] = arr[i];
				index += 1;
				
				}
			}
			if (right_index > end_two)
				for(int i=right_index; i<end_two + 1; i++) {
				output_list[index] = arr[i];
				index += 1;
				
			}
	}
		
		index = start_one;
		for(int i=0; i<output_length; i++) {
				arr[index] = output_list[i];
				index += 1;
		}
		return index;
	
	}
}