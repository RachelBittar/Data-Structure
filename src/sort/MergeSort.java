package sort;

import java.util.Arrays;


public class MergeSort {

	public static void main(String[] args) {

		int[] a = {10,9,8,7};

		System.out.print(Arrays.toString(mergesort(a, a.length)));
	}

	private static int[] mergesort(int[] item, int n) {

		if (item.length <= 1)
			return item;

		int middle = n / 2;
		int[] left = new int[middle];
		int[] right = new int[n - middle];

		for (int i = 0; i < middle; i++) {
			left[i] = item[i];
		}

		for (int i = middle; i < n; i++) {
			right[i - middle] = item[i];
		}

		mergesort(left, middle);
		mergesort(right, n - middle);

		return merge(item, left, right, middle, n - middle);

	}

	private static int[] merge(int[] item, int[] left, int[] right, int middle, int n) {

		int i = 0;
		int j = 0;
		int k = 0;

		while (i < middle && j < n) {
			if (left[i] <= right[j])
				item[k++] = left[i++];
			else
				item[k++] = right[j++];
		}

		while (i < middle) {
			item[k++] = left[i++];
		}

		while (j < n) {
			item[k++] = right[j++];
		}

		return item;

	}

}