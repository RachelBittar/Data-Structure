package BasicAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class KthSmallest {
	
	
	public static int partition(Integer[] arr, int l, int r){
		
		int x = arr[r];
		int i = l;
		
		for (int j = l; j <= r - 1; j++) {
			if (arr[j] <= x) {
				// Swapping arr[i] and arr[j]
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				i++;
			}
}

// Swapping arr[i] and arr[r]
int temp = arr[i];
arr[i] = arr[r];
arr[r] = temp;

return i;
}
	
	
	

	public static void main(String[] args) {
		
		int[] arr = {6,80,36,8,23,7,10,12,42,99};
		int k = 10;
		
		fastSelect(arr, k);
		
	}

}