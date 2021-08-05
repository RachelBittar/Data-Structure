package BasicAlgorithms;

import java.util.Arrays;

public class FindKthLargest {

	
	public static void main(String[] args) {
		
		int[] arr = {1,2,3,4,5};
		int k = 1;
		
		System.out.println("main "+ findKthLargest(arr,k));
		
	}

	public static int findKthLargest(int[] nums, int k) {
        
        int p=k-1;
		while(p>1) {
			bubblesort(nums);
			p--;
		}
		bubblesort(nums);
		
		System.out.print(Arrays.toString((bubblesort(nums))));

        return (bubblesort(nums)[p]);
    }
    
    private static int[] bubblesort(int[] arr) {
		
		int temp = 0;
		
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] < arr[i + 1]) {
				temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}
		return arr;
	}
	
}
