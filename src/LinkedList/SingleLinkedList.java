package LinkedList;

class Node {  //creating nodes [data|node]
	  public int data;
	  public Node next;

	  public Node(int data) {  //Node constructor
	    this.data = data;	   //[5|null]
	    next = null;
	  }
	}

	class LinkedList {
		
	  public Node head; //First Node Head

	  public LinkedList(int data) {
	    Node a = new Node(data);  //[5, null]
	    head = a;				  // Head = [5, null]	
	  }

	  public void traversal() {
		  
	    Node temp = head; //temporary pointer to point to head
	    				  //Temp = Head = [5, null]
	    

	    while(temp != null) { //This node is not null		
	      System.out.print(temp.data+"\t");
	      temp = temp.next;
	    }

	    System.out.println("");
	  }

	  // Head = [5, head.next]
	  // n = [8, null]
	  
	  public void insertAtBeginning(Node n) { 
	    n.next = head; //n = [8|[ [5|head.next->[null]]
	    head = n;      //
	  }

	  //insert new node at last
	  public void insertAtLast(Node n) {
	    Node temp = head;

	    while(temp.next != null) {
	      temp = temp.next;
	    }

	    temp.next = n;
	  }

	  //function to insert a node after a node
	  public void insertNodeAfter(Node n, Node a) {
	    n.next = a.next;
	    a.next = n;
	  }

	  //function to delete
	  public void del(Node n) {
	    Node temp = head;
	    if(temp == n) { //node to be deleted is head
	      head = n.next;
	    }
	    else { //node to be deleted is not head
	      while(temp != null) {
	        if(temp.next == n) { //node previous to node to be deleted
	          temp.next = n.next;
	          break; //breaking the loop after deleting the node
	        }
	        temp = temp.next;
	      }
	    }
	  }
	}

	class ListMain {
		
	  public static void main(String[] args) {
	    LinkedList l = new LinkedList(10);

	    Node a,b,c;			//creating nodes
	    a = new Node(20);   //[20|null]
	    b = new Node(50);	//[50|null]
	    c = new Node(60);	//[60|null]

	    //connecting to linked list
	    /*
	       ----     ----     ----     ----
	      |head|-->| a  |-->|  b |-->|  c |-->NULL
	      |____|   |____|   |____|   |____|
	    */

	    l.head.next = a;
	    a.next = b;
	    b.next = c;

	    l.traversal();

	    Node z;

	    z = new Node(0);
	    l.insertAtBeginning(z);
	    z = new Node(-10);
	    l.insertAtBeginning(z);

	    z = new Node(100);
	    l.insertAtLast(z);

	    z = new Node(30);
	    l.insertNodeAfter(z, a);
	    z = new Node(40);
	    l.insertNodeAfter(z, a.next);
	    z = new Node(500);
	    l.insertNodeAfter(z, a.next.next);

	    l.traversal();

	    l.del(l.head);
	    l.del(z);

	    l.traversal();
	  }
	}