package recursion;

import java.util.ArrayList;
import java.util.List;

public class PascalsTriangle {


	public static List<Integer> getRow(int n) {
	    List<Integer> row = new ArrayList() {
	          {
	            add(1);
	          }
	        };
	        
	        

	    for (int k = 1; k <= n; k++) {
	      row.add((int) 
	    		  ((row.get(row.size() - 1) * (long) (n - k + 1)) / k));
	    }

	    return row;
	  }
	
	
	
	
/*While knowing Pascal's rule does not give us any benefits over previous approaches, knowing that the numbers in Pascal's triangle are just binomial coefficients will come in handy.

Successive binomial coefficients {n \choose r-1}( 
r−1
n
​	
 ) and {n \choose r}( 
r
n
​	
 ) differ by a factor of:*/	



	public static void main(String[] args) {
			
			List<Integer> list;
			list = getRow(3);
			System.out.println(list);
		}
}
