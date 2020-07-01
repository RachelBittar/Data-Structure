package sort;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
	private static final Scanner scanner = new Scanner(System.in);
	private static int[] vectors = {120, 8, 7, 5, 2, 0, 1,16, 30};

	public static void main(String[] args) {

		
		
			for(int i=0; i<vectors.length;i++) {
				
				System.out.print(vectors[i]+" ");
			
			}
			
			System.out.println();
			System.out.println("SelectionSort: "+Arrays.toString(selectionSort(vectors)));
			
		

	}

	private static int[] selectionSort(int[] vectors) {
		
		
		int minIndex =0;
		int temp;
		
		for(int i = 0; i<vectors.length-1; i++) {
			
			minIndex = i;
						
			for(int j = i+1; j<vectors.length-1; j++) {
				
					if(vectors[minIndex]>vectors[j]) {
					
						temp = vectors[minIndex];
						vectors[minIndex]=vectors[j];
						vectors[j] =temp;
						
					}		
				
			}
						
			
		}
		 return vectors;
		
		
	}

}
