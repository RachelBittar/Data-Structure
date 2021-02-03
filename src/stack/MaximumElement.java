package stack;

import java.util.Arrays;
import java.util.Scanner;


class Stack{
	
	int initial_size=0;
	int next_index=0;
	int num_elements=0;
	int[]arr = null;
    
    Stack(int initial_size){
        this.arr = new int[initial_size];
        this.next_index = 0; //top
        this.num_elements = 0; //how many items on the stack
    
    }
    
    public void push(int data) {
    	
        if (this.next_index == (this.arr).length)
            System.out.println("Out of space! Increasing array capacity ...");
    	
    	this.arr[this.next_index] = data;
    	this.next_index += 1;
    	this.num_elements += 1;
    } 
    
}
public class MaximumElement {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    int max = Integer.MIN_VALUE;
		    
		    Stack StackNode  = new Stack();
    }


}
