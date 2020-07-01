package sort;

import java.util.Arrays;
import java.util.Scanner;

public class InsertionSort {
	
	private static final Scanner scanner = new Scanner(System.in);
	private static int[] arr = {120, 8, 7, 5, 2, 0, 1,16, 30};

	public static void main(String[] args) {
		
			for(int i=0; i<arr.length;i++) {
				System.out.print(arr[i]+" ");	
			}
			
			System.out.println();
			System.out.println("InsertionSort: "+ Arrays.toString(insertionSort(arr)));
			
}

	private static int[] insertionSort(int[] arr) {
		
		int current=0;
		int j=0;
		
		for(int i=0; i<arr.length; i++) {		
			j = i;				
			while((j>0) && (arr[j-1]>arr[j])) {
				current = arr[j-1];
				arr[j-1] =arr[j];
				arr[j] = current;
				j=j-1;
				
			}
		}
			return arr;
		
		
	}
}