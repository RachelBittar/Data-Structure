package stack;

import java.util.Scanner;

class Node {

	String data;
	Node next;

	Node(String word) {

		this.data = word;
		this.next = null;
	}

}

public class StackLL {

	static Node head = null;

	private static final Scanner sc = new Scanner(System.in).useDelimiter("\\n");

	public static void main(String[] args) {

		try {
			while (sc.hasNext()) {

				String line = sc.nextLine();

				if (line.equals("-"))
					pop();
				else {
					push(new Node(line));
				}

			}

		} finally {
			print();
			sc.close();
		}

		

	}

	private static void print() {

		if (head == null) {
			System.out.print("Empty");
			return;
		} else {
			while (head != null) {
				System.out.print(head.data + " ");
				head = head.next;
			}
		}
	}

	static void pop() {

		if (head == null)
			return;

		head = head.next;

	}

	static void push(Node node) {

		if (head == null)
			head = node;
		else {
			node.next = head;
			head = node;
		}

	}

}
