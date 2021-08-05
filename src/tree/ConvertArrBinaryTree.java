  package tree;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

class NodeBT {
	NodeBT left;
	NodeBT right;
    int data;
    
    NodeBT(int data) {
        this.data = data;
        left = null;
        right = null;    
    }
        
    public NodeBT get_left_child() {
        return this.left;
    }
    
    public NodeBT get_right_child() {
        return this.right;
    }
    
    public boolean has_left_child() {
 		   
 		   if(get_left_child()!=null)
 			   return true;
 		   
 		   return false;
 	 } 
 	   
 	 public boolean has_right_child() { 
 		   if(get_right_child()!=null)
 			   return true;
 		   
 		   return false;
 	  } 

}



public class ConvertArrBinaryTree {

	public static void main(String[] args) {
		
		int[] arr = {1, 2, 3, 4};
		
		NodeBT p = ArrayToBinaryTree(arr, 0, arr.length - 1);
		
	
		int n = diameter_of_binary_tree(p)[1];
		System.out.println(n);
		

	}

	public static NodeBT ArrayToBinaryTree(int[] arr, int start, int end) {
		
		if (start > end)
			return null;
 
		int mid = (start + end) / 2;
		
		NodeBT root = new NodeBT(arr[mid]);
	
		
		root.left = ArrayToBinaryTree(arr, start, mid - 1);
		root.right = ArrayToBinaryTree(arr, mid + 1, end);
 
		return root;
	}

	  
	public static int[]  diameter_of_binary_tree(NodeBT root) {
	    	 
		int DandH[] = { 0, 0 };
		if (root != null) {

			int[] leftResult = diameter_of_binary_tree(root.left);
			int[] rightResult = diameter_of_binary_tree(root.right);

			int height = Math.max(leftResult[0], rightResult[0]) + 1;
			
			int leftDiameter = leftResult[1];
			int rightDiameter = rightResult[1];
			
			int rootDiameter = leftResult[0] + rightResult[0] + 1;
			
			int finalDiameter = getMax(leftDiameter, rightDiameter,rootDiameter);
			
			
			DandH[0] = height; 
			DandH[1] = finalDiameter;
			return DandH;
		}
		return DandH;
	}
		
	
	
		public static int getMax(int a, int b, int c) {
			return Math.max(a, Math.max(b, c));
		}
	
}





