package dynamic_programming;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Max_Array_Sum  {

    static int maxSubsetSum(int[] arr) {
    	
    /*
     * Dynamic programming is basically an optimization
     *  algorithm. 
     *  It means that we can solve any problem without using 
     *  dynamic programming but we can solve it in a better way 
     *  or optimize it using dynamic programming.*/
    	
    	int max = 0;
        int[] dp = new int[arr.length + 1];
        /*
         * The basic idea of dynamic programming is to store the
         * result of a problem after solving it. 
         * So when we get the need to use the solution of the 
         * problem, then we don't have to solve the problem again 
         * and just use the stored solution.*/
        
        int tmp=0;
 
        dp[0] = 0; 
        dp[1] = arr[0];  //3   
        dp[2] = arr[1];	 //5
        
        for(int i = 3; i <= arr.length; i++) {
        				 //[1]->3  //0->0
           tmp = Math.max(dp[i-2], dp[i-3]); 
           // 3
            
           if(0 <= arr[i-1]) { // [2]->5     //3+5=8
            	dp[i] = Math.max(arr[i-1], tmp + arr[i-1]); 	
            }
            else dp[i] = tmp; //3
            
            max = Math.max(max, dp[i]);
        }
        System.out.println(Arrays.toString(dp));
        
        return max;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
 
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        int res = maxSubsetSum(arr);

        System.out.println(res);
        scanner.close();
    }

}
