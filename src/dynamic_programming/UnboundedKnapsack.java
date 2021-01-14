package dynamic_programming;

import java.io.IOException;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class UnboundedKnapsack {
	
	
	
    // Complete the unboundedKnapsack function below.
	// Unbounded Knapsack Problem (UKP)
	///Here, there is no limitation on the quantity of a specific item 
	// we can take. 
	
    static int unboundedKnapsack(int k, int[] arr) {

    	int vector[] = new int[k + 1]; 
    	
    	for(int i = 0; i <= k; i++){ 
            for(int j = 0; j < n; j++){ 
                if(wt[j] <= i){ 
                    dp[i] = max(dp[i], dp[i - wt[j]] +  
                                val[j]); 
                } 
            } 
        } 
        return dp[W]; 

    	return 0;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      
        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] nk = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nk[0]);

        int k = Integer.parseInt(nk[1]);

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int result = unboundedKnapsack(k, arr);
        
        System.out.println();

    }

}
