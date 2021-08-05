package dynamic_programming;

import java.util.Scanner;


class knapsack01 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
	     int t = scan.nextInt();
	
	      while(t-- > 0) {
	    	  
	          int c = scan.nextInt();
	          int n = scan.nextInt();
	          int value[]  = new int [n];
	  		  int weight[] = new int [n];
	  		  int r=0;
	  		  
	      
	           for(int i=0;i<=c; i++) {
	        	   value[i]=scan.nextInt();
	           	   weight[i]=scan.nextInt();
	           	 
	           }
	           
	         System.out.println(dpknapsack01(n, c, value, weight));
	        }
	
	}

	static int dpknapsack01(int n, int c, int[] weight, int[] value) {
		
		double m[][] = new double[value.length+1][c+1];
		double a = 0;
		double b =0;
		
		for(int i=0 ;i<=value.length;i++) {
			
			for(int w=0 ;w<=c; w++) {
				
				if( w>0 && i>0) {
					if(w>=weight[i-1]&& w>0) {
					
						a=m[i-1][w];
						b=m[i-1][w-weight[i-1]]+value[i-1];
						
						m[i][w] = Math.max(a,b);
					
					}
					else {
						
						m[i][w] =m[i-1][w];
					}
				}
				else
					m[i][w]=0;
			}			
		
		}
		//System.out.print(m[value.length][c]);
		return (int) m[value.length][c];
		
		
	}
}