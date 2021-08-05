package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DynamicArray {
	
	 public static void main(String[] args) {
	        // 1. initialize
	       // List<Integer> v0 = new ArrayList<>();
	        List<Integer> v1;                           // v1 == null
	        
	        // 2. cast an array to a vector
	        Integer[] a = {0, 1, 2, 3, 4};
	        v1 = new ArrayList<>(Arrays.asList(a));
	        
	        // 3. make a copy
	        List<Integer> v2 = v1;                      // another reference to v1
	        List<Integer> v3 = new ArrayList<>(v1);     // make an actual copy of v1
	        
	        // 3. get length
	        System.out.println("The size of v3 is: " + v3.size());
	        
	        // 4. access element
	        System.out.println("The first element in v3 is: " + v3.get(0));
	        
	        // 5. iterate the vector
	        System.out.print("[Version 1] The contents of v3 are:");
	        for (int i = 0; i < v3.size(); ++i) {
	            System.out.print(" " + v3.get(i));
	        }

}
	 }
