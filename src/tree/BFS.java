package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {

	public static void main(String[] args) {
		
		MyTree tree = new MyTree("apple");
		MyNode root = tree.getRoot();
		List<String> p = new ArrayList<String>();
		

		tree.getRoot().set_left_child(new MyNode("banana"));

		tree.getRoot().set_right_child(new MyNode("cherry"));

		tree.getRoot().get_right_child().set_left_child(new MyNode("berry"));

		tree.getRoot().get_right_child().set_right_child(new MyNode("grape"));

		tree.getRoot().get_left_child().set_left_child(new MyNode("dates"));

		tree.getRoot().get_left_child().set_right_child(new MyNode("mango"));
		
		p = bfs(tree);
		
		System.out.println(Arrays.toString(p.toArray()));

	}

	private static List<String> bfs(MyTree tree) {
		
		List<String> visit_order= new ArrayList<String>();
		Queue<MyNode> q = new LinkedList<>();
		
		MyNode node = tree.getRoot();
		q.add(node);
		
		while(q.size()>0) {
			
			node = (MyNode) q.remove();
			visit_order.add(node.data);
			
			if(node.has_left_child())
				q.add(node.get_left_child());	
			
			if(node.has_right_child())
				q.add(node.get_right_child());	
		}
		
		return visit_order;
	
	}

}
