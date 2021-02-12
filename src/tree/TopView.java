package tree;

import java.util.*;
import java.io.*;

class TopView {


	public static void topView(Node root) {
      
      List<Integer> visit_order= new ArrayList<Integer>();
      Queue<Node> q = new LinkedList<>();
        
        Node nodeL = root;
        q.add(nodeL);
        
        while(q.size()>0) {
            
            nodeL = (Node) q.remove();
            visit_order.add(nodeL.data);
            
            if(nodeL.left!=null)
                q.add(nodeL.left);        
        }
        
       Node nodeR = root.right;
        q.add(nodeR);
        
        while(q.size()>0) {
            
            nodeR = (Node) q.remove();
            visit_order.add(nodeR.data);
            
            if(nodeR.right!=null)
                q.add(nodeR.right);    
        }

        System.out.println(Arrays.toString(visit_order.toArray()));

      
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
        Node root = null;
        while(t-- > 0) {
            int data = scan.nextInt();
            root = insert(root, data);
        }
        scan.close();
        topView(root);
    }	
}