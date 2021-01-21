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

	public Node append(int value) {
		if (head == null) {
			head = new Node(value);
			return head;
		}

		tail = head;

		while (tail.next != null) {
			tail = tail.next;
		}

		tail.next = new Node(value);
		return head;

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

	public List<Integer> toList() {

		List<Integer> out = new ArrayList<>();
		Node aux;
		aux = head;

		while (aux != null) {
			out.add(aux.data);
			aux = aux.next;

		}
		return out;
	}

	public Node prepend(int value) { // Adding new node to head (beggining of list)

		Node node = new Node(value);

		if (head == null)
			return node;

		node.next = head;
		//return node
		head = node;
		return head;

	}

	public int search(int value) {

		if (head == null)
			return -1;

		Node node = head;
		while (node != null) {
			if (node.data == value)
				return node.data;
			node = node.next;
		}

		return -1;
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
	

		for (int value : list) {
			
			new_node = new Node(value); // read head -> node
			new_node.next = prev_node;  // node = null
			prev_node = new_node;      // null-> new_node

			head = new_node;		

		}
		return head;

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

		lb.append(1);
		lb.append(2);
		lb.append(3); // Adding node at tail
		
		System.out.println("[Append] Add at end: " + lb.toList());
		
		lb.prepend(0);
		System.out.println("[Prepend]Add at front: " + lb.toList());
		
		
		lb.reverse(lb.toList());
		System.out.println("Reverse: " + lb.toList());

		
		System.out.println("Search found: " + lb.search(1));

		lb.deleteNode(3);
		System.out.println("Delete: " + lb.toList());

		System.out.println("Size: " + lb.size());
		
		System.out.println("Pop: " + lb.pop());
//


		System.out.println("*-----------DoublyLinkedList-------------*");
		DoublyLinkedList linked_list = new DoublyLinkedList();
		linked_list.append(1);
		linked_list.append(-2);
		linked_list.append(4);

	}

}
