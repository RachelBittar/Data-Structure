package tree;

import java.util.*;
import java.io.*;

class TopView {

	
	public static void leftNode(Node left){
        if(left!=null){
            leftNode(left.left);
        System.out.print(left.data+ " ");
        }

    }
    public static void rightNode(Node right){
        if(right!=null){
            System.out.print(right.data+ " ");
            rightNode(right.right);
        }

    }
	public static void topView(Node root) {
        if(root!=null){
        
        leftNode(root.left);
        System.out.print(root.data+" ");
        rightNode(root.right);
        
        }
       
      
      
    }

	

	public static Node insert(Node root, int data) {
        if(root == null) {
            return new Node(data);
        } else {
            Node cur;
            if(data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }
	
	
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String s = scan.next();
        s += scan.nextLine();
        
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}