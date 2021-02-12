package BasicAlgorithms;

public class Binary_search {

	public static void main(String[] args) {

		int[] multiple = { 3, 4, 6, 7, 7, 7, 8, 9, 10 };

		int r = binary_search_recursion(7, multiple, 0, multiple.length - 1);
		System.out.println("Middle: " + r);

		int re = find_start_index(7, multiple, 0, multiple.length - 1);
		System.out.println("Start: " + re);

		int res = find_end_index(7, multiple, 0, multiple.length - 1);
		System.out.println("End: " + res);
	}

	static int binary_search_recursion(int target, int[] array, int start_index, int end_index) {

		int mid_index = start_index + (end_index-start_index) / 2;
		int mid_element = array[mid_index];

		if (array[mid_index] == target) {
			return mid_index;
		}

		if (target > array[end_index]) {
			return -1;
		}

		if (target < array[start_index]) {
			return -1;
		}

		if (target > mid_element) {
			return binary_search_recursion(target, array, mid_index + 1, end_index);
		}

		if (target < mid_element) {
			return binary_search_recursion(target, array, start_index, mid_index - 1);
		}

		return mid_element;

	}

	public static int find_start_index(int target, int[] array, int start_index, int end_index) {

		int current_start_pos = 0;
		int start_pos;

		if (start_index > end_index)
			return -1;

		int mid_index = start_index + (end_index - start_index) / 2;

		if (array[mid_index] == target) { //start = 0 true
			
			current_start_pos = find_start_index(target, array, 
												 start_index, mid_index - 1);
		
		if (current_start_pos != -1) 
			start_pos = current_start_pos;
		else 
			start_pos = mid_index;
		
			return start_pos;
		}

		if (array[mid_index] < target)
			return find_start_index(target, array, mid_index + 1, end_index);
		else
			return find_start_index(target, array, start_index, mid_index - 1);
	}





	public static int find_end_index(int target, int[] array, int start_index, int end_index) {

		int current_end_pos;
		int end_pos;

		if (start_index > end_index)
			return -1;

		int mid_index = start_index + (end_index - start_index) / 2;

		if (array[mid_index] == target) {
			
			current_end_pos = find_end_index(target, array, mid_index + 1, end_index);
			
			if (current_end_pos != -1)
				end_pos = current_end_pos;
			else
				end_pos = mid_index;

			return end_pos;
		}

		if (array[mid_index] < target)
			return find_end_index(target, array, mid_index + 1, end_index);
		else
			return find_end_index(target, array, start_index, mid_index - 1);
	}

}
