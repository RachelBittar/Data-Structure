package dynamic_programming;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class longestCommonSubsequence {

    // Complete the longestCommonSubsequence function below.
    static int longestCommonSubsequence(int[] a, int[] b) {
    	
    	int m[][] = new int [a.length+1][b.length+1];
    
    	int i=0, j=0;
    	int l = 6;
    	int c = 5;
    	
   
    	for (i=0; i <l; i++) {	
    		for (j=0; j<c; j++) {

    			if(i>0 && j>0) {
	    			if (a[i-1] != b[j-1]) {
	    				m[i][j] = Math.max(m[i - 1][j], m[i][j - 1]);
	    			} else {
	    				m[i][j] = 1 + m[i - 1][j - 1];
	    			}
    			}
    		}
    	}
    	
    	return m[l][c];

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] nm = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nm[0]);

        int m = Integer.parseInt(nm[1]);

        int[] a = new int[n];

        String[] aItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aItems[i]);
            a[i] = aItem;
        }

        int[] b = new int[m];

        String[] bItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int bItem = Integer.parseInt(bItems[i]);
            b[i] = bItem;
        }

        int result = longestCommonSubsequence(a, b);

       /* for (int i = 0; i < result.length; i++) {
            System.out.println(String.valueOf(result[i]));

            if (i != result.length - 1) {
            	System.out.println(" ");
            }
        }
*/
       // bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
    }
}
