package recursion;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class SuperDigit {

    // Complete the superDigit function below.
	  static int superDigit(String n, int k) {


	   }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      
        String[] nk = scanner.nextLine().split(" ");

        String n = nk[0];

        int k = Integer.parseInt(nk[1]);

        int result = superDigit(n, k);
        System.out.println(result);
     

        scanner.close();
    }
}
