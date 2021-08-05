package dynamic_programming;


import java.io.*;
import java.math.*;
import java.util.*;



public class fibonacciModified {

    // Complete the fibonacciModified function below.
	//t(i) = t(i-2)+t(i-1)^2
	
	static BigInteger [] memo;
    static int fibonacciModified(int t1, int t2, int n) {

    	memo = new BigInteger [n+1];
    	memo[0]= BigInteger.valueOf(t1);
    	memo[1]= BigInteger.valueOf(t2);
    	BigInteger m;
    	
    	for(int i=2; i<n ; i++) {
    	m=memo[i-1].pow(2);	 	
    	 memo[i] = (memo[i-2].add(m));
    	}
        

    	
    	int s = memo[n-1].intValueExact();
    	
    	return  s;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
      //  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

      //  String[] t1T2n = scanner.nextLine().split(" ");

      //  int t1 = Integer.parseInt(t1T2n[0]);

      //  int t2 = Integer.parseInt(t1T2n[1]);

      //  int n = Integer.parseInt(t1T2n[2]);

    	int  result = fibonacciModified(0, 1, 10);
        System.out.print(result);

      //  bufferedWriter.write(String.valueOf(result));
      //  bufferedWriter.newLine();

       // bufferedWriter.close();

        scanner.close();
    }
}
