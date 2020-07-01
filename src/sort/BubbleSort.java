package sort;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BubbleSort {

    // Complete the countSwaps function below.
    static int[] countSwaps(int[] a) {
    	
    	int aux=0;
    	boolean swapped = false;

    	for (int i = 0; i < a.length; i++) { 
    		swapped = false;
    		
    	    for (int j = 0; j < a.length-i-1; j++) {  	    	
    	        if (a[j] > a[j + 1]) {     
    	        	aux	= a[j+1];
					a[j+1]=a[j];
					a[j]=aux;
					swapped = true;
    	        }
    	    }
    	    
    	    if(!swapped) {
    	    	System.out.println("BREAK");
    	    	break;
    	    }
    	        
    	}
    	//System.out.println("Array : "+Arrays.toString(a));

    	return  a;
	  
    }

    public static void main(String[] args) {
        int[] a= {4, 8, 1, 3, 10, 9, 2, 11, 5, 6};
        System.out.println(Arrays.toString(countSwaps(a)));
        
    }
}


