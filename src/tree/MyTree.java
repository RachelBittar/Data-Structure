package tree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class MyTree {

	static MyNode root = null;
	static List<String> visit_order = new ArrayList<String>();

	public MyTree(String value) {
		this.root = new MyNode(value);
	}

	public MyNode getRoot() {
		return this.root;
	}

	private void preOrder() {
		preOrder(root);
		System.out.println(Arrays.toString(visit_order.toArray()));
	}

	private void inOrder() {
		inOrder(root);
		System.out.println(Arrays.toString(visit_order.toArray()));
	}

	private void posOrder() {
		posOrder(root);
		System.out.println(Arrays.toString(visit_order.toArray()));
	}

	private static List preOrder(MyNode node) {

		if (node != null) {
			visit_order.add(node.get_value());
			if (node.has_left_child())
				preOrder(node.get_left_child());

			if (node.has_right_child())
				preOrder(node.get_right_child());
		}
		return visit_order;
	}

	private static List<String> inOrder(MyNode node) {

		if (node != null) {

			if (node.has_left_child())
				inOrder(node.get_left_child());

			visit_order.add(node.get_value());

			if (node.has_right_child())
				inOrder(node.get_right_child());
		}
		return visit_order;
	}

	private static List<String> posOrder(MyNode node) {

		if (node != null) {

			if (node.has_left_child())
				inOrder(node.get_left_child());

			if (node.has_right_child())
				inOrder(node.get_right_child());

			visit_order.add(node.get_value());
		}
		return visit_order;
	}

	public static void main(String[] args) {

		MyTree tree = new MyTree("apple");
		MyNode root = tree.getRoot();

		// System.out.println("Root: "+ tree.getRoot().data);

		tree.getRoot().set_left_child(new MyNode("banana"));

		tree.getRoot().set_right_child(new MyNode("cherry"));

		tree.getRoot().get_right_child().set_left_child(new MyNode("berry"));

		tree.getRoot().get_right_child().set_right_child(new MyNode("grape"));

		tree.getRoot().get_left_child().set_left_child(new MyNode("dates"));

		tree.getRoot().get_left_child().set_right_child(new MyNode("mango"));

		// tree.preOrder();
		// tree.inOrder();

		tree.posOrder();

	}

}
