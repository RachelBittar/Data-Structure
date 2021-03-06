package Amazon;

import java.util.Arrays;
import java.util.List;

/*
 * 1. Find the missing number in the array
 * You are given an array of positive numbers from 1 to n, such that all 
 * numbers from 1 to n are present except one number x.
 * You have to find x. The input array is not sorted.
 *  
 * Look at the below array and give it a try before checking the solution.
 *  3 7 1 2 8 4 5
 *  n = 8
 *  missing number = 6
 * 
 * */


public class find_missing {

	public static void main(String[] args) {

		int num[] = { 3, 7, 1, 2, 8, 4, 5 };

		int[] r = fm(num);
		System.out.print(Arrays.toString(r));
	}

	static int[] fm(int[] arr) {
		int n = arr.length;
		return helper(arr, n);
	}

    static int[] helper(int[]arr,int n) {

    	if (arr.length <= 1)
			return arr;

		int middle = n / 2;
		int[] left = new int[middle];
		int[] right = new int[n - middle];

		for (int i = 0; i < middle; i++) 
			left[i] = arr[i];
		
		for (int i = middle; i < n; i++)
			right[i - middle] = arr[i];
		

		helper(left, middle);
		helper(right, n - middle);

		return arr;

    }
  }
