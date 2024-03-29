package tree;

import java.util.*;
import java.io.*;

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

class Insertion {
  
  	public static void preOrder( Node root ) {
      
    	if( root == null)
        	return;
      
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
     
    }

 

	public static Node insert(Node root,int data) {
		
		if(root==null) {
			root = new Node(data);
			return root;
		}
		Node node;
		if(data < root.data) {
			node = insert(root.left, data);
			root.left = node;
		}
		else {
			node = insert(root.right, data);
			root.right = node;
		}
		return root;

    }

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
      	preOrder(root);
    }
}