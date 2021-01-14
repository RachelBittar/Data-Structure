package LinkedList;

import java.util.ArrayList;
import java.util.List;

import LinkedList.InsertNodeAtTail.SinglyLinkedListNode;

class Node {
	int data;
	Node next;

	Node(int data) {
		this.data = data;
		this.next = null;
	}
}

class DoubleNode {
	// This type of list has connections backwards and forwards through the list.
	int data;
	DoubleNode next;
	DoubleNode previous;

	DoubleNode(int data) {
		this.data = data;
		this.next = null;
		this.previous = null;
	}
	// Now that we have backwards connections it makes sense to track the tail of
	// the linked list as well as the head.
}

class LinkedListTraversing {

	public void add(List<Integer> al) {

		Node head = null;
		Node node;

		for (int value : al) {

			if (head == null) {
				head = new Node(value);
				System.out.println("Head " + head.data);

			} else { // Tail
				node = new Node(value);

				while (node != null) { // Finding end of list
					System.out.println("Tail " + node.data);
					node = node.next;
				}

			}
		}
	}

}

class LinkedListBetter {

	Node head = null;
	Node tail = null;

	public Node createLinkedList(int value) {

		head = new Node(value);
		return head;

	}

	public Node append(int value) {

		Node new_node = new Node(value); // creating new Node
		Node node = head; // aux node pointing to head -> otherwise you would
		// lose reference to head.

		while (node.next != null) { // finding end of linkedlist
			node = node.next;
		}

		node.next = new_node; // Adding node to the end of listt
		return head; // return starting reference

	}

	public Node deleteNode(int position) {

		if (head == null)
			return head;
		if (position == 0)
			return head.next; // Remove head

		int counter = 0;
		Node node = head;

		while (counter < (position - 1)) {
			node = node.next;
			counter++;

		}

		node.next = node.next.next;
		return head;

	}

	public List<Integer> toList(Node node) {

		List<Integer> out = new ArrayList<>();

		while (node != null) {
			out.add(node.data);
			node = node.next;

		}
		return out;
	}

	public Node prepend(int value) { // Adding new node to head (beggining of list)

		Node node = new Node(value);

		if (head == null)
			return node;

		node.next = head;
		head = node.next;
		return head;

	}

	public Node search(int value) {

		if (head == null)
			return null;

		Node node = head;
		while (node != null) {
			if (node.data == value)
				return node;
			node = node.next;
		}

		head = node;

		return head;
	}

	public int size() {

		int counter = 0;
		Node node = head;

		while (node != null) {
			node = node.next;
			counter++;
		}

		return counter;
	}

	public Node reverse(List<Integer> list) {

		Node prev_node = null;
		Node new_node = null;
		Node new_list = null;

		for (int value : list) {
			new_node = new Node(value);
			new_node.next = prev_node;
			prev_node = new_node;

			new_list = prev_node;

		}
		return new_list;

	}
	
	public int pop() {
	    // Return the first node's value and remove it from the list. 
		
	    if (head == null) {
	        return -1;
	    }
	    return head.data;
	
	}


	
	public boolean iscircular(List<Integer> list) {	

    
		return true;
	}
}

/*
 * 
 * Exercise: Implement a doubly linked list that can append to the tail in
 * constant time. Make sure to include forward and backward connections when
 * adding a new node to the list.
 */

class DoublyLinkedList {

	public void append(int value) {

		DoubleNode head = null;
		DoubleNode tail = null;

		if (head == null) {
			head = new DoubleNode(value);
			tail = head;

		}

		tail.next = new DoubleNode(value);
		tail.next.previous = tail;
		tail = tail.next;
		System.out.println(tail.data);

	}

}

public class LinkedList {

	public static void main(String[] args) {

		System.out.println("*-----------Inicial-------------*");
		// Node head = new Node(1);
		// System.out.println(head.data + " -> " + head.next);
		//
		//
		// Node nnode = new Node(2);
		// System.out.println(nnode.data + " -> " + nnode.next);
		//
		// head.next = nnode;
		//
		// head.next = new Node(2);
		// System.out.println(head.data + " -> " + head.next.data);
		//
		//
		// head.next.next = new Node(3);
		// System.out.println( head.next.data+ " -> " + head.next.next.data);
		//
		// head.next.next.next = new Node(4);
		// System.out.println( head.next.next.data+ " -> " + head.next.next.next.data);
		//

		System.out.println("*-----------LinkedListTraversing-------------*");
		List<Integer> al = new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);

		// LinkedListTraversing lt = new LinkedListTraversing();
		// lt.add((al));
		// System.out.println("O(n2)");

		System.out.println("*-----------LinkedListBetter-----------------*");

		LinkedListBetter lb = new LinkedListBetter(); // creating Linked/

		System.out.println("Head: " + lb.toList(lb.createLinkedList(1)));
		lb.toList(lb.append(0));
		lb.toList(lb.append(2));
		lb.toList(lb.append(3)); // Adding node at tail
		
		Node n = lb.append(4);
		
		
		System.out.println("Add at end: " + lb.toList(lb.append(5)));
		List<Integer> l = lb.toList(n);
		System.out.println("Reverse: " + lb.toList(lb.reverse(l)));

		System.out.println("Add at front: " + lb.toList(lb.prepend(0))); // adding node at head

		System.out.println("Search found: " + lb.toList(lb.search(5)));

		System.out.println("Delete: " + lb.toList(lb.deleteNode(2)));

		System.out.println("Size: " + lb.size());
		
		System.out.println("Pop: " + lb.pop());



		System.out.println("*-----------DoublyLinkedList-------------*");
		DoublyLinkedList linked_list = new DoublyLinkedList();
		linked_list.append(1);
		linked_list.append(-2);
		linked_list.append(4);

	}

}
