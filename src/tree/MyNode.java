package tree;

public class MyNode {

	String data;
	
	MyNode left = null;
	MyNode right = null;
	
	MyNode(String value){ //Constuctor
	        this.data = value;
	        
	        this.left = null;
	        this.right = null;
	}

	   public void set_value(String value) {
	        this.data = value;
	   }
	        
	   public String get_value() {
	        return this.data;
	   }
	        
	   public void set_left_child(MyNode left) {
	        this.left = left;
	   }
	   
	   public void set_right_child(MyNode right) {
	        this.right = right;
	   }
	   
	    public MyNode get_left_child() {
	        return this.left;
	   }
	    
	    public MyNode get_right_child() {
	        return this.right;
	   }
	    
	   public boolean has_left_child() {
		   
		   if(get_left_child()!=null)
			   return true;
		   
		   return false;
	   } 
	   
	   public boolean has_right_child() { 
		   if(get_right_child()!=null)
			   return true;
		   
		   return false;
	   } 

	    
}