package recursion;

public class Binary_search {

	public static int binary_search(int[] arr, int target) {
		
		return binary_search_func(arr, 0, (arr.length) - 1, target);
	}
		

	public static int binary_search_func(int[] arr,
			int start_index,
			int end_index,
			int target)
	{

		if (start_index > end_index)
			return -1;

		int mid_index = (start_index + end_index) / 2;

		if (arr[mid_index] == target) {
			return mid_index;
		}
		if (arr[mid_index] > target)
			return binary_search_func(arr, start_index, mid_index - 1, target);

		else
			return binary_search_func(arr, mid_index + 1, end_index, target);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 0, 1, 2, 3, 4, 5, 6, 7, 8 };
	    System.out.println(binary_search(arr, 1));
	}

}
