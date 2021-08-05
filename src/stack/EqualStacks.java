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
	 * The function is expected to return an INTEGER. The function accepts following
	 * parameters: 1. INTEGER_ARRAY h1 2. INTEGER_ARRAY h2 3. INTEGER_ARRAY h3
	 * 
	 * 5 3 4 3 2 1 1 1 4 3 2 1 1 4 1
	 * 
	 * 
	 */

	public static int equalStacks(List<Integer> h1, List<Integer> h2, List<Integer> h3) {

		int sum1 = 0, sum2 = 0, sum3 = 0;
		int maxHeight = 0;

		Stack<Integer> s1 = new Stack<Integer>();
		Stack<Integer> s2 = new Stack<Integer>();
		Stack<Integer> s3 = new Stack<Integer>();

		for (int num = h1.size()-1 ; num >-1; num--) {
			sum1 = sum1 + h1.get(num);
			s1.push(sum1);
		}

		for (int num = h2.size()-1 ; num >-1; num--) {
			sum2 = sum2 + h2.get(num);
			s2.push(sum2);
		}

		for (int num = h3.size()-1 ; num >-1; num--) {
			sum3 = sum3 + h3.get(num);
			s3.push(sum3);
		}

		while (!s1.isEmpty() && !s2.isEmpty() && !s3.isEmpty()) {

			int stack1 = s1.peek();
			int stack2 = s2.peek();
			int stack3 = s3.peek();

			if (stack1 == stack2 && stack2 == stack3) {
				maxHeight = s1.peek();
				break;
			}

			
			if (stack1 >= stack2 && stack1 >= stack3) 
				s1.pop();
				
			else if (stack2 >= stack1 && stack2 >= stack3) {
				s2.pop();
				
			} else if (stack3 >= stack1 && stack3 >= stack2) {
				s3.pop();
			}
		}

		return maxHeight;

	}

}

public class EqualStacks {
	public static void main(String[] args) throws IOException {

		// BufferedReader bufferedReader = new BufferedReader(new
		// InputStreamReader(System.in));
		// bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		// String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$",
		// "").split(" ");

		Scanner in = new Scanner(System.in);
		int n1 = 5;

		int n2 = 3;

		int n3 = 4;

		int[] h1Temp = { 3, 2, 1, 1, 1 };

		List<Integer> h1 = new ArrayList<>();

		for (int i = 0; i < n1; i++) {
			h1.add(h1Temp[i]);
		}

		int[] h2Temp = { 4, 3, 2 };

		List<Integer> h2 = new ArrayList<>();

		for (int i = 0; i < n2; i++) {
			h2.add(h2Temp[i]);
		}

		int[] h3Temp = { 1, 1, 4, 1 };
		List<Integer> h3 = new ArrayList<>();

		for (int i = 0; i < n3; i++) {
			h3.add(h3Temp[i]);
		}

		int result = Result.equalStacks(h1, h2, h3);

		System.out.println(String.valueOf(result));

	}
}
