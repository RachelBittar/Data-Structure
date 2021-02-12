package stack;

import java.util.Scanner;
import java.util.Stack;

public class MaximumElement {

	public static void main(String[] args) {
		
		Stack<Integer> stack    = new Stack<Integer>();
	    Stack<Integer> maxStack = new Stack<Integer>(); 
	    
	   // 1    -Push the element x into the stack.
	   // 2    -Delete the element present at the top of the stack.
	   // 3    -Print the maximum element in the stack.

	     Scanner scan = new Scanner(System.in);
	     int N = scan.nextInt();
	        
	     for (int i = 0; i < N; i++) {
	           int query = scan.nextInt();
	           
	            switch (query) {
	                case 1:	 //Push the element x into the stack.
	                    int element = scan.nextInt();
	                    stack.push(element);
	                    if (maxStack.isEmpty() || element >= maxStack.peek()) 
	                        	maxStack.push(element);
	                    break;
	                    
	                case 2: //Delete the element present at the top of the stack.
	                    int delete = stack.pop();
	                    if (delete == maxStack.peek())
	                        maxStack.pop();
	                    
	                    break;
	                case 3:  //Print the maximum element in the stack
	                    System.out.println(maxStack.peek());
	                    break;
	                    
	                default:
	                    break;
	            }
	        }        
	        scan.close();
	}

}
