package BasicAlgorithms;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class IcecreamParlor {

     static int[] icecreamParlor(int target, int[] arr) {

        Arrays.sort(arr);
    
        int[] soma = {0,0};
        
        int front_index = 0;
        int back_index = arr.length - 1;

        while (front_index < back_index) {
            int front = arr[front_index];
            int back = arr[back_index];

            if (front + back == target) {
              
                soma[0] = front;
                soma[1] = back;
            }
            
            if (front + back < target)       // sum < target ==> shift front pointer forward
                front_index ++; 
            else
                back_index --;               // sum > target ==> shift back pointer backward
        }
        

        return soma;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

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

            
            System.out.println(Arrays.toString((icecreamParlor(m, arr))));
  
            //bufferedWriter.newLine();
        }

        //bufferedWriter.close();

       
    }
}
