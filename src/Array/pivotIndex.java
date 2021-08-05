package Array;

public class pivotIndex {

	public static void main(String[] args) {

		int[] arr = { 2, 1, -1 };
		int pivot = pivotIndex(arr);

		System.out.print(pivot);

	}

	public static int pivotIndex(int[] nums) {

		int leftSum = 0;
		int rightSum = 0;

		for (int i = 0; i < nums.length; i++) {

			leftSum = 0;
			rightSum = 0;

			for (int left = 0; left < i; left++) {
				leftSum = leftSum + nums[left];
			}
			
			for (int right = i + 1; right <= nums.length - 1; right++) {
				rightSum = rightSum + nums[right];
			}
			
			if (leftSum == rightSum) {
				return i;
			}

		}
		return -1;
	}

}
