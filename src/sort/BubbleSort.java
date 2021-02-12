package sort;

import java.util.*;


public class BubbleSort { // O(n2)

	public static void main(String[] args) {
		int[] a = { 8, 3, 1, 7, 0 };
		System.out.println("1 " + Arrays.toString(bubble_sort_1(a)));
		System.out.println("2 " + Arrays.toString(bubble_sort_1(a)));
		System.out.println("3 " + Arrays.toString(bubble_sort_1(a)));
		System.out.println("4 " + Arrays.toString(bubble_sort_1(a)));

	}

	public static int[] bubble_sort_1(int[] a) {

		int temp = 0;
		for (int i = 0; i < a.length - 1; i++) {

			if (a[i] > a[i + 1]) {
				temp = a[i];
				a[i] = a[i + 1];
				a[i + 1] = temp;
			}
		}
		return a;
	}
}
