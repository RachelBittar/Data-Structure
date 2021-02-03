package recursion;

public class Deep_reverse {

	public static void main(String[] args) {
		
		int a[][] = {{1,2,3,4,7,8},{5,6}};
		int b[][] = deep_reverse(a);
	}

	private static int[][] deep_reverse(int[][] arr) {
		
		 //# Terminaiton / Base condition
		    if ((arr.length) < 1) {
		        return arr;
		    }
		    
		    int reversed_items[][]; //  final list to be returned
		    
		    //Traverse the given list (array) in the reverse direction using extended slice.'''
		    // For a given list, sample syntax are - myList[1:10:2], myList[:-1:1], myList[::-1]
		    // The first argument is the starting index of the slice (inclusive),
		    // second argument is the ending index of the slice (exclusive),
		    // third argument is the increment/decrement step size.
		    // If we do not specify an argument, it means to consider all elements from that end of the list. 
		    
		    for (int j=0;j<arr.length;j++) {
		    	for (int i=0;i<arr.length;i++) {
		        
		       //If this item is a list itself, invoke deep_reverse to reverse the items recursively.
		        if (arr[i][j] is list)
		        	arr[i][j] = deep_reverse(arr[i][j]);
		        
		       //append the item to the final list
		        reversed_items.append(item);
		    }
		    return reversed_items
		
		
		return null;
	}

}
