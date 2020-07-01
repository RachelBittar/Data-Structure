package sort_test;

	import java.io.*;
	import java.math.*;
	import java.security.*;
	import java.text.*;
	import java.util.*;
	import java.util.concurrent.*;
	import java.util.regex.*;

	public class Solution {

	    // Complete the maximumToys function below.
	    static int maximumToys(int[] prices, int k) {
	    	
	    	Arrays.sort(prices);
	    	int sum=0;
	    	int i=0;
	    	
	    	while(sum<=k ) {
	    	  sum = sum+prices[i];
	    	  i++;
	    	  
	    	 
	    	}
	    	 	
	    	return i-1;
	    }

	    private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) throws IOException {
	
	        String[] nk = scanner.nextLine().split(" ");

	        int n = Integer.parseInt(nk[0]);

	        int k = Integer.parseInt(nk[1]);

	        int[] prices = new int[n];

	        String[] pricesItems = scanner.nextLine().split(" ");
	        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

	        for (int i = 0; i < n; i++) {
	            int pricesItem = Integer.parseInt(pricesItems[i]);
	            prices[i] = pricesItem;
	        }

	        int result = maximumToys(prices, k);
	        System.out.println(result);

	        scanner.close();
	    }
	}