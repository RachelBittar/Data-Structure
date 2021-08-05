package sort;

import java.util.Arrays;

public class CountingInversions {

	public static void main(String[] args) {
		
		int[] a = {2, 5, 1, 3, 4};

		System.out.println(Arrays.toString(count_inversions(a)));
		
	}

	private static int[] count_inversions(int[] a) {
		
		int mid = a.length/2;
		int start =0;
		int[] left = new int[mid];
		int[] right = new int[a.length - mid];
		int y=0;
		
		if(a.length==1) return a;
		
		while(start<mid) {
			left[start]=a[start];
			start++;
		}
		
		while(mid+y<a.length) {
			right[y]=a[mid+y];
			y++;
		}
		
		left = count_inversions(left);
		System.out.print("Left:"+ Arrays.toString(left));
		
		System.out.println();
		
		right = count_inversions(right);
		System.out.print("Right:"+ Arrays.toString(right));
		
		return right;
		
	}

	

}
