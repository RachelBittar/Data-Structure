package Array;

public class MaximumWealth {

	public static int maximumWealth(int[][] accounts) {
		
		int sum =0;
		int max = Integer.MIN_VALUE;
		
		for(int i=0; i<accounts.length; i++) {	
			for(int j =0 ; j< accounts[0].length; j++) {
				sum += accounts[i][j];
			}
			
			max = Math.max(max, sum);
			sum=0;
		}
			return max;
	        
	}
	  
	public static void main(String[] args) {
		
		int[][] accounts = {{1,2,3},{3,2,1}};
		
		int r = maximumWealth(accounts);
		System.out.print(r);
	}

}
