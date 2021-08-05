package Greedy;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class MarcsCakewalk {

    // Complete the marcsCakewalk function below.
    static long marcsCakewalk(int[] calorie) {

    	double sum=0; 	
   	    Arrays.sort(calorie);
   	
     	for(int i=0; i<calorie.length; i++) {

    		sum += calorie[calorie.length-i-1] * Math.pow(2, i);
    	
    	}
    	return (long)sum;

    }

  

   



	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] calorie = new int[n];

        String[] calorieItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int calorieItem = Integer.parseInt(calorieItems[i]);
            calorie[i] = calorieItem;
        }

        long result = marcsCakewalk(calorie);

        System.out.print(result);
     

        scanner.close();
    }
}
