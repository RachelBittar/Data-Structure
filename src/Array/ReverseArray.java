package Array;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ReverseArray {
//Using Binary Division
    
	static int[] reverseArray(int[] a) {

		int aux = 0;
		int n = a.length;

		for (int i = 0; i < n / 2; i++) {
			aux = a[i];
			a[i] = a[n - 1 - i];
			a[n - 1 - i] = aux;
		}

		return a;
	}

	static int[] reverseArrayBinary(int[] a) {

		int start = 0;
		int end = a.length-1;
		int aux;
		
		while(start<=end) {
			
			aux = a[start];
			a[start]=a[end];
			a[end]=aux;
			start++;
			end--;		
		}

		return a;
	}
	
	
	
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    	int[] arr = {1,2,3,4,5,6};
    	
        int[] res = reverseArrayBinary(arr);
        System.out.print(Arrays.toString(res));

    }
}
