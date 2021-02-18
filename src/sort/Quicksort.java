package sort;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Quicksort {

    // Complete the quickSort function below.
	
	public static int[] sort_all(int[] items, int begin_index, int end_index) {
	
	 if (end_index <= begin_index)
			return items;

       int pivot_index = sort_a_little_bit(items, begin_index , end_index);

       sort_all(items, begin_index, pivot_index - 1);
       sort_all(items, pivot_index + 1, end_index);
       
       return items;
    
	}
	private static int sort_a_little_bit(int[] items, int begin_index, int end_index) {
		  int left_index = begin_index;
		  int pivot_index = end_index;
		  
		  int  pivot_value = items[pivot_index];
			    
			 while (pivot_index != left_index) {
			    
				 int  item = items[left_index];
			     if (item <= pivot_value) {
			            left_index += 1;
			             continue;
			      }
			            
			      items[left_index] = items[pivot_index - 1];
			      items[pivot_index - 1] = pivot_value;
			      items[pivot_index] = item;
			      pivot_index -= 1;
			 }
			 
			 return pivot_index;
		
	}
	public static int[] quicksort(int [] items) {
		
		return sort_all(items, 0, (items.length) - 1);
    }
    

    public static void main(String[] args) throws IOException {
        
       int [] a = {8, 3 ,1 ,7 ,0 ,10, 2};
       int [] r = quicksort(a);
       
       System.out.print(Arrays.toString(r));
       
    }
}
