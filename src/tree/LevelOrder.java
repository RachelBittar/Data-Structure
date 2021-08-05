package tree;


import java.util.*;
import java.io.*;


class LevelOrder {

	public static void levelOrder(Node root) {
      
	//	List<Integer> visit_order= new ArrayList<Integer>();
		Queue<Node> q = new LinkedList<>();
		
		Node node = root;
		q.add(node);
		
		while(q.size()>0) {
			
			node = (Node) q.remove();
			//visit_order.add(node.data);
			System.out.print(node.data+ " ");
			
			if(node.left!=null)
				q.add(node.left);	
			
			if(node.right!=null)
				q.add(node.right);	
		}
		
	//	System.out.println(Arrays.toString(visit_order.toArray()));
      
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
        levelOrder(root);
    }	
}