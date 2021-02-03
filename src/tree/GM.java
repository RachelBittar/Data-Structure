package tree;


class Tree {

	Node root = null;

	public Tree(int value) {
		this.root = new Node(value);
	}

	public Node getRoot() {
		return this.root;
	}
}


class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}


public class GM {

	public static void main(String[] args) {
	
		
		int[] arr = {1,2,3,4,5,6,7,8,9};	
		binaryDivision(arr,start,end);

	}

	private static Node binaryDivision(int[] arr, int start, int end) {
		
		if (start > end)
			return null;
		
		int mid = (start+end)/2;
		Node root = new Node(arr[mid]);
		
		root.left =  binaryDivision(arr,start,mid-1);
		root.right = binaryDivision(arr,mid+1,end);
		
		return root;
		
		

	}

}
