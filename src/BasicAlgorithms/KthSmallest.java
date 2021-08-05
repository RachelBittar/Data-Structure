package BasicAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthSmallest {
	

	public static void main(String[] args) {
		
		int[] arr = {6,80,36,8,23,7,10,12,42,99};
		int k = 3;
		
		fastSelect(arr, k);
		
	}

	private static void fastSelect(int[] arr, int k) {
		
		int p =k;
		while(k>0) {
			bubblesort(arr);
			k--;
		}
		
		System.out.print(Arrays.toString((bubblesort(arr))));
		System.out.println();
		System.out.println((bubblesort(arr)[p-1]));
		
	}

	private static int[] bubblesort(int[] arr) {
		
		int temp = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		return arr;
	}
}