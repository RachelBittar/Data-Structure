package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWithCandies {

	 public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
	        
         int max = Integer.MIN_VALUE;
		    
		    for (int candy : candies) {
		      max = Math.max(max, candy);
		    }
		    
		    List<Boolean> ans = new ArrayList<>();
		    for (int i = 0; i < candies.length; i++) {
		      ans.add((candies[i] + extraCandies) >= max);
		    }
		    return ans;
		  }
        
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candies = {2,3,5,1,3};
		int extraCandies = 3;
		
		List<Boolean> r = kidsWithCandies(candies,extraCandies);
		System.out.print(Arrays.toString(r.toArray()));
		
		
		
	}

}
