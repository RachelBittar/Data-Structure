package dynamic_programming;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'getWays' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. LONG_INTEGER_ARRAY c
     */

    public static long getWays(int n, List<Long> c) {
 
    	 // initiate the list with length amount + 1 and prefill with ( amount + 1)
		   int[] memo = new int [n+1];
		
		   Arrays.fill(memo, 0);
		   memo[0]=0;
		   
		  for(int i=1; i<memo.length;i++) {
			  for(int j = 0; j<c.size(); j++) {
				  
				  if(c.get(j)<=i) {
	
					  memo[i]=Math.max(memo[i], 1+ memo[i-c.get(j).intValue()]);
				  }
				  
			  }
		  }
			 return memo[n]> n? -1: Long.valueOf(memo[n]);
    	
    	

    }

}

public class TheCoinChangeProblem {
	static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
    
    	int n = scan.nextInt();

        int m = scan.nextInt();

        List<Long> c = new ArrayList<>();
      
        for (int i = 0; i < m; i++) {
            //long cItem = 1;
            c.add(Long.valueOf(scan.nextInt()));
     
        }

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        long ways = Result.getWays(n, c);
        System.out.print(ways);

      // bufferedWriter.write(String.valueOf(ways));
      //  bufferedWriter.newLine();

      //  bufferedReader.close();
      //  bufferedWriter.close();
    }
}
