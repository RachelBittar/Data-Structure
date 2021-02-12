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
    static int[] quickSort(int[] items) {
    	
    	int pivot_index = items.length - 1;
    	int pivot_value = items[pivot_index];
    	
    	int left_index = 0;
        
        while (pivot_index != left_index) {
       
        	int item = items[left_index];
       
            if (item <= pivot_value) {
                left_index += 1;
                continue;
           }
          // Place the item before the pivot at left_index\n",
            
           items[left_index] = items[pivot_index - 1];
          // Shift pivot one to the left\n",
            items[pivot_index - 1] = pivot_value;
          // Place item at pivot's previous location\n",
            items[pivot_index] = item;
          // Update pivot_index\n",
            pivot_index -= 1;
        }
     
            return items;
       


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int[] result = quickSort(arr);

        for (int i = 0; i < result.length; i++) {
          
        	System.out.print(String.valueOf(result[i])+" ");
  
            if (i != result.length - 1) {
               // bufferedWriter.write(" ");
            }
        }

       // bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
    }
}
