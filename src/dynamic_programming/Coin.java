package dynamic_programming;

import java.util.Arrays;
import java.util.Scanner;


public class Coin {
	
	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
	
	int N = scan.nextInt();	
	int coins[] = new int[N];
	int min = scan.nextInt();	//coin_change(coins, 6);
	int i=0;	

	 while(i<N){
		 coins[i]=scan.nextInt();
		 i++;
    }
		
	 int r = coin_change(coins, min);
	 
	 System.out.print(r);
		

	}

	static int coin_change(int[] coins, int amount) {
		
		 // initiate the list with length amount + 1 and prefill with ( amount + 1)
		   int[] memo = new int [amount+1];
		
		   Arrays.fill(memo, amount+1);
		   memo[0]=0;
		   
		  for(int i=1; i<memo.length;i++) {
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