package BasicAlgorithms;

/*
 * 
 * Sunny and Johnny like to pool their money and go to the ice cream parlor.
 * Johnny never buys the same flavor that Sunny does.
 *  
 * The only other rule they have is that they spend all of their money.
 * Given a list of prices for the flavors of ice cream, 
 * select the two that will cost all of the money they have.

 * For example, they have  to spend and there are flavors costing .
 * The two flavors costing  and  meet the criteria. Using -based indexing, 
 * they are at indices  and .

Function Description

It should return an array containing the indices of the prices of 
the two flavors they buy, sorted ascending.

 * 
 * */



import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IcecreamParlor {

    // Complete the icecreamParlor function below.
    static int[] icecreamParlor(int m, int[] arr) {
    	
    	 System.out.println(Arrays.toString(arr));
    	 System.out.println("M " + m);
    	   	 
    	 return arr;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int m = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int[] result = icecreamParlor(m, arr);
            //System.out.println(Arrays.toString(result));
            
            for (int i = 0; i < result.length; i++) {
                //bufferedWriter.write(String.valueOf(result[i]));

                if (i != result.length - 1) {
                   // bufferedWriter.write(" ");
                }
            }

           // bufferedWriter.newLine();
        }

        //bufferedWriter.close();

        scanner.close();
    }
}

