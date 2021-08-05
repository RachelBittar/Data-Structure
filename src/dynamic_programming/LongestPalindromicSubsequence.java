package dynamic_programming;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class LongestPalindromicSubsequence {

    // Complete the longestPalindromicSubsequence function below.
    static int longestPalindromicSubsequence(String input_string, int k) {

    	 n 			n = input_string.length() ;
    			  
    			    // create a lookup table to store results of subproblems 
    			    int L[][] = new int[n+1][n+1]; 
    			  
    			    // strings of length 1 have LPS length = 1
    			    for (int i=0; i<n; i++) { 
    			        L[i][i] = 1 
    			    
    			    // consider all substrings
    			    for s_size in range(2, n+1): 
    			        for start_idx in range(n-s_size+1): 
    			            end_idx = start_idx + s_size - 1
    			            if s_size == 2 and input_string[start_idx] == input_string[end_idx]:
    			                // match with a substring of length 2
    			                L[start_idx][end_idx] = 2
    			            elif input_string[start_idx] == input_string[end_idx]: 
    			                // general match case
    			                L[start_idx][end_idx] = L[start_idx+1][end_idx-1] + 2
    			            else:
    			                // no match case, taking the max of two values
    			                L[start_idx][end_idx] = max(L[start_idx][end_idx-1], L[start_idx+1][end_idx]); 
    			  
    			   /
    			    
    			    return L[0][n-1];
    	
    	

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            String s = scanner.nextLine();

            int result = longestPalindromicSubsequence(s, k);

            bufferedWriter.write(String.valueOf(result));
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
