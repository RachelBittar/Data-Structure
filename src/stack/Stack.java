package stack;

import java.util.Arrays;

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
    
    public static void main(String[] args) {
		// TODO Auto-generated method stub
    	
    	Stack foo = new Stack(1);
    	
    	
    	foo.push(5);
    	foo.push(15);
    	String str = Arrays.toString(foo.arr);
    	System.out.println(str);

	}
}

