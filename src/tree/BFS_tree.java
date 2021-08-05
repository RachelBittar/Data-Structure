package tree;

public class BFS_tree {


	public static void main(String[] args) {
		
		int[] num = {1,2,3,4,5,6,7,8,9,10};
		
		loadTree(num);

	}

	static void loadTree(int[] num) {
		
		int leaf = binary(num, 0, num.length-1);
		System.out.print(num[leaf]);
		
	}

	static int binary(int[] num, int start, int end) {

		int mid = (start+end)/2;
		
		if(mid<=0) return 0;
		if(mid>=end) return end;
		
		binary(num,start,mid-1);
		
		System.out.print(mid);
		
		return mid;
		
		
		

	}

}
