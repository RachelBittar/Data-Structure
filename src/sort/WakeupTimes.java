package sort;

import java.util.Arrays;

/*
 * 
 * "Sam records when they wake up every morning.
 *  Assuming Sam always wakes up in the same hour, 
 *  use bubble sort to sort by earliest to latest.\n",
 * 
 * */
public class WakeupTimes {

	public static void main(String[] args) {

		int[] a = { 16, 49, 3, 12, 56, 49, 55, 22, 13, 46, 19, 55, 46, 13, 25, 56, 9, 48, 45 };

		System.out.println(Arrays.toString(wakeupTimesLatest(a)));
		System.out.println(Arrays.toString(wakeupTimesEarliest(a)));

	}

	private static int[] wakeupTimesLatest(int[] a) {

		int temp;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] > a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}

	private static int[] wakeupTimesEarliest(int[] a) {

		int temp;

		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1; j++) {

				if (a[j] < a[j + 1]) {
					temp = a[j + 1];
					a[j + 1] = a[j];
					a[j] = temp;
				}
			}
		}
		return a;
	}
	
	
	
	

}
