package Maps;

public class Heap {
	int[] cbt;
	int next_index = 0 ;
	
	Heap(){
		this.cbt = new int[20];
		this.next_index = 0;	
	}
	
	
	public void _up_heapify() {

		int child_index = this.next_index;

		while (child_index >= 1) {

			int parent_index = (child_index - 1) / 2;
			int parent_element = this.cbt[parent_index];
			int child_element = this.cbt[child_index];

			if (parent_element > child_element) {
				this.cbt[parent_index] = child_element;
				this.cbt[child_index] = parent_element;

				child_index = parent_index;
			} else {
				break;
			}
		}
}
	
	
	public void insert(int data) {
	        //insert element at the next index
	        this.cbt[this.next_index] = data;

	        // heapify
	        this._up_heapify();

	        // increase index by 1
	        this.next_index += 1;

	        //double the array and copy elements if next_index goes out of array bounds
	        
	        if (this.next_index >= (this.cbt.length)) {
	            int[] temp = this.cbt;
	        
	        	
	        }
	 }


	public static void main(String[] args) {
		
		
		

	}

}



   