package dynamic_programming;

public class MinStack {

	    static int[] arr;
	    static int   index=0;
	    static int   capacity=5;
	    
	    public MinStack() {
	    	this(16);
	    }
	    
	    public MinStack(int capacity) {
	    	arr = new int[capacity];
	    }
	      
	    public void push(int elem) {
	    	
	    	if(index==capacity) {
	    		resize();		
	    	}
	    	arr[index]=elem;
	    	index++;
	    	
	    }
	    
	    private void resize() {
			int[] new_array = new int[capacity*2];
			for(int i=0; i<capacity; i++) {
				new_array[i]=arr[i];
			}
			arr=new_array;
			capacity = capacity*2;
		}

		public void pop() {
			
			if(index == 0) throw new IndexOutOfBoundsException();
			int[] new_array = new int[index-1];
			
			for(int i=0; i<index-1; i++) {
				new_array[i]=arr[i];
			}
			
			arr=new_array;
	    }
	    
	    public int top() {
			return arr[index];
	        
	    }
	    
	    public int getMin() {
			return 0;
	        
	    }

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MinStack obj = new MinStack();

		obj.push(8); //elemento
		obj.push(81); //elemento
		obj.push(81);
		obj.push(81);
		obj.push(81);
		obj.pop();
		int param_3 = obj.top();
		int param_4 = obj.getMin();
		
		System.out.println(obj.toString());

	}

}
