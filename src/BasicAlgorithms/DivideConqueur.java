package BasicAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DivideConqueur {

	public static void main(String[] args) {

		Integer[] arr = { 6, 80, 36, 8, 23, 7, 10, 12, 42, 99 };
		List<Integer> list = Arrays.asList(arr);

		System.out.print(fastSelect(list, 10));

	}

	private static int findPivot(List<Integer> arr, int k) {

		List<Integer> setOfMedians = new ArrayList<Integer>();

		int i = 0;
		int pivot = 0;
		int n = arr.size();

		while (i < n / 5) {
			int median = findMedian(arr, 5 * i, 5);
			setOfMedians.add(median);
			i += 1;
		}

		if (5 * i < n) {
			int median = findMedian(arr, 5 * i, n % 5);
			setOfMedians.add(median);
		}

		if (setOfMedians.size() == 1)
			pivot = (int) setOfMedians.get(0);

		if (setOfMedians.size() > 1)
			pivot = findPivot(setOfMedians, (setOfMedians.size() / 2));

		return pivot;

	}

	public static int fastSelect(List<Integer> arr, int k) {

		List<Integer> arr_Less_P = new ArrayList<Integer>();
		List<Integer> arr_Equal_P = new ArrayList<Integer>();
		List<Integer> arr_More_P = new ArrayList<Integer>();

		int pivot = findPivot(arr, k);

		for (int element : arr) {

			if (element < pivot)
				arr_Less_P.add(element);

			if (element > pivot)
				arr_More_P.add(element);

			if (element == pivot)
				arr_Equal_P.add(element);
		}


		if (k <= (arr_Less_P.size()))
			return fastSelect(arr_Less_P, k);

		if (k > (arr_Less_P.size()) + (arr_Equal_P.size())) {
			return fastSelect(arr_More_P, (k - (arr_Less_P.size()) - (arr_Equal_P.size())));
		} else
			return pivot;

	}

	private static int findMedian(List<Integer> arr, int start, int size) {
		int[] mediaList = new int[size];

		for (int i = 0; i < (size); i++)
			mediaList[i] = arr.get(start + i);

		Arrays.sort(mediaList);

		return mediaList[size / 2];
	}
}
