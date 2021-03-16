package recursion;



public class Knapsack01Recursive {
	
	static public class Item{
		
		int weight;
		int value;
		
		Item(int w, int v) {
			this.weight = w;
			this.value = v;
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Item items[] = new Item[3];

		items[0] = new Item(10,7);
		items[1] = new Item(9,8);
		items[2] = new Item(5,6);
		

		int r  = knapsack_max_value(15,items);
		System.out.print(r);
	}
	
	
	public static int  knapsack_max_value(int knapsack_max_weight, Item items[]) {
	       int lastIndex = items.length - 1;
	       int[][] lookup_table =  new int[items.length][knapsack_max_weight];
	       
//	       for(Item item : items) {
//	    	   
//	    	   // for capacity in reversed(range(knapsack_max_weight + 1)):
//	    	   
//	    	   for(int capacity = items[lastIndex].weight; lastIndex>=0; lastIndex-- )
//	    		   
//	    	   if (item.weight <= capacity) {
//	                lookup_table[capacity] = Math.max(lookup_table[capacity], lookup_table[capacity - item.weight] + item.value);
//	    	   }
//	    	 
//	       }
	       return knapsack_recursive(knapsack_max_weight, items, lastIndex);
	  }
	    		
	      
	   
	       
	    
	
	
	public static int knapsack_recursive(int capacity, Item items[], int lastIndex) {
       // Base case
        if ((capacity <= 0) || (lastIndex<0))
            return 0;
      
	
        // Put the item in the knapsack
        int valueA = 0;
        if (items[lastIndex].weight <= capacity) 
            valueA = 
            items[lastIndex].value + 
            knapsack_recursive(capacity - items[lastIndex].weight, items, lastIndex - 1);
    
        // Do not put the item in the knapsack
        int valueB = knapsack_recursive(capacity, items, lastIndex - 1);
       
       //Pick the maximum of the two results\n,
        int result = Math.max(valueA, valueB);
       
        return result;

        }
}