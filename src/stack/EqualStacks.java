package stack;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

class Result {

    /*
     * Complete the 'equalStacks' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY h1
     *  2. INTEGER_ARRAY h2
     *  3. INTEGER_ARRAY h3
     */

    public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {
    return 0;

    }

}

public class EqualStacks {
    public static void main(String[] args) throws IOException {
    	
       // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       // bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       // String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

    	Scanner in = new Scanner(System.in); 
        int n1 = in.nextInt();

        int n2 = in.nextInt();

        int n3 = in.nextInt();

        String[] h1Temp = in.nextLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> h1 = new ArrayList<>();

        for (int i = 0; i < n1; i++) {
            int h1Item = Integer.parseInt(h1Temp[i]);
            h1.add(h1Item);
        }

        String[] h2Temp = in.nextLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> h2 = new ArrayList<>();

        for (int i = 0; i < n2; i++) {
            int h2Item = Integer.parseInt(h2Temp[i]);
            h2.add(h2Item);
        }

        String[] h3Temp = in.nextLine().replaceAll("\\s+$", "").split(" ");

        List<Integer> h3 = new ArrayList<>();

        for (int i = 0; i < n3; i++) {
            int h3Item = Integer.parseInt(h3Temp[i]);
            h3.add(h3Item);
        }

        int result = Result.equalStacks(h1, h2, h3);

        System.out.println(String.valueOf(result));
      
    }
}
