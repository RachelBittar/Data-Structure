package tree;


public class State {
	
	MyNode node = null;
	boolean visited_left;
	boolean visited_right;
	
	State(MyNode node){
	        this.node = node;
	        this.visited_left = false;
	        this.visited_right = false;
	}
	    
	public MyNode get_node() {
	        return this.node;
	}
	    
	public boolean get_visited_left() {
	        return this.visited_left;
	}
	
	    
	public boolean get_visited_right() {
	        return this.visited_right;
	}
	    
	public void set_visited_left() {
	    this.visited_left = true;
	 }
	        
	public void set_visited_right() {
	        this.visited_right = true;
	}

}