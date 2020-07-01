package recursion;

public class Memo {
	static int[] memo = new int[51];
	
	static int fib(int n) 
    { 
    if(n <= 1) 
       return n;
    if(memo[n]!=-1){
    	return memo[n];		
    }
    
    memo[n]= fib(n-1) + fib(n-2); 	
    return memo[n];
    	 
  } 
       
   public static void main (String args[]) 
    { 
   
    	for (int i=0; i<50; i++) 
    	{ 
    	    memo[i]= -1;  	   
    	}
    	System.out.println(System.currentTimeMillis());
    	System.out.println(fib(20)); 
    	System.out.println(System.currentTimeMillis());
    } 	

}
