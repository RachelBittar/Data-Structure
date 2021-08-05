package String;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

import org.hamcrest.core.SubstringMatcher;

public class SuperReducedString {

	// Complete the superReducedString function below.
	static String superReducedString(String s) {

		String reduced = s;
		for (int i = 0; i < s.length() - 1; i++) {

			if (s.charAt(i) == s.charAt(i + 1)) {

				reduced = s.replace(s.substring(i, i + 2), "");

				reduced = superReducedString(reduced);

				return reduced;

			}
		}

		return reduced;

	}

	public static void main(String[] args) throws IOException {
		// BufferedReader bufferedReader = new BufferedReader(new
		// InputStreamReader(System.in));
		// BufferedWriter bufferedWriter = new BufferedWriter(new
		// FileWriter(System.getenv("OUTPUT_PATH")));

		// String s = bufferedReader.readLine();

		String result = superReducedString("aaaabbb");
		System.out.print(result);

		// bufferedWriter.write(result);
		// bufferedWriter.newLine();

		// bufferedReader.close();
		// bufferedWriter.close();
	}
}
