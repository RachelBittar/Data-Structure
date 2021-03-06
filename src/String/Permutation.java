package String;

import java.util.Scanner;

public class Permutation {


	public static void permutation(String s) {
		
		int n = s.length();
		char[] a = new char[n];
		
		for (int i = 0; i < n; i++)
			a[i] = s.charAt(i);
		
		permutation(a, n);
	}

	private static void permutation(char[] a, int n) {
		
		if (n == 1) {
			System.out.println(new String(a));
			return;
		}
		for (int i = 0; i < n; i++) {
			
			swap(a, i, n - 1);
			permutation(a, n - 1);
			swap(a, i, n - 1);
		}
	}


	private static void swap(char[] a, int i, int j) {
		char c = a[i];
		a[i] = a[j];
		a[j] = c;
	}

	public static void main(String[] args) {
		
		String elements = "abc";
		
		permutation(elements);
	}

}
