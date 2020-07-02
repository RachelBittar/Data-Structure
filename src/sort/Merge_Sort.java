package sort;

import java.util.Arrays;

class Merge {
	
	  public static void merge(int a[], int start, int middle, int end) {
	    int sizeOfTemp1, sizeOfTemp2, i, j, k;

	    //temporary arrays to copy the elements of subarray
	    sizeOfTemp1 = (middle-start)+1;
	    sizeOfTemp2 = (end-middle);

	    int[] temp1 = new int[sizeOfTemp1];
	    int[] temp2 = new int[sizeOfTemp1];

	    for(i=0; i<sizeOfTemp1; i++) {
	      temp1[i] = a[start+i];
	    }

	    for(i=0; i<sizeOfTemp2; i++) {
	      temp2[i] = a[middle+1+i];
	    }

	    i=0;
	    j=0;
	    k=start;

	    while (i < sizeOfTemp1 && j < sizeOfTemp2) {
	      if (temp1[i] < temp2[j]) {
	        // filling the main array with the smaller element
	        a[k] = temp1[i];
	        i++;
	      }
	      else {
	        // filling the main array with the smaller element
	        a[k] = temp2[j];
	        j++;
	      }
	      k++;
	    }

	    // copying leftovers
	    while (i<sizeOfTemp1) {
	      a[k] = temp1[i];
	      k++;
	      i++;
	    }

	    while (j<sizeOfTemp2) {
	      a[k] = temp2[j];
	      k++;
	      j++;
	    }
	  }

	  public static void mergeSort(int a[], int start, int end) {
		  
		int middle =0;
	    if (start < end) {
	       middle = (start+end)/2;
	       mergeSort(a, start, middle);
	       mergeSort(a, middle+1, end);
	       merge(a, start, middle, end);
	    }
	  }

	  public static void main(String[] args) {
	    int a[] = {4, 8, 1, 3, 10, 9, 2, 11, 5, 6};
	    System.out.println(Arrays.toString(a));
	    mergeSort(a, 0, 9);
	    
	    System.out.print(Arrays.toString(a));
	   
	  }
	}