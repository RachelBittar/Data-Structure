package dynamic_programming;

import java.util.Arrays;

public class Coin {
	
	
	public static void main(String[] args) {
		
		int coins[] = {1, 2, 3};
		coin_change(coins, 6);

	}

	static int coin_change(int[] coins, int amount) {
		
		 // initiate the list with length amount + 1 and prefill with ( amount + 1)
		   int[] memo = new int [amount+1];
		
		   Arrays.fill(memo, amount+1);
		   memo[0]=0;
		   
		  for(int i=0; i<=memo.length;i++) {
			  for(int j = 0; j<coins.length; j++) {
				  
				  if(coins[j]<=i) {
					  
					  memo[i]=Math.min(memo[i], 1+ memo[i-coins[j]]);
				  }
				  
			  }
		  }
			 return memo[amount]> amount? -1: memo[amount];
			  
		
	}

	

}

/* Coin Change\,
    
You are given coins of different denominations and a total amount of money.
Write a function to compute the fewest coins needed to make up that amount.
If that amount of money cannot be made up by any combination of the coins,
return.

As an example:
Input: `coins = [1, 2, 3]`, 
`amount = 6`,
Output: `2`,

* Explanation: The output is `2` because we can use `2` coins with value `3`.
* That is, `6 = 3 + 3`. 
* We could also use `3` coins with value `2` 
* (that is, `6 = 2 + 2 + 2`),
*  but this would use more coins—and the problem specifies we 
*  should use the smallest number of coins possible.,
*/