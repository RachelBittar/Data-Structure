package recursion;

public class Bottom_up {
	
	
 static int fib(int n) {
	 
	 int[] F = new int[n+1];
	 F[n] = 0;
	 F[1] = 1;

	 for(int i=2; i<=n; i++) {
	      F[i] = F[i-1] + F[i-2];
	  }
	    return F[n];
} 
	
	
 public static void main (String args[]) 
{    
	  //System.out.println(System.currentTimeMillis());
	  System.out.println(fib(8));
	  //System.out.println(System.currentTimeMillis());
	  //System.out.println(fib(49));
	  
}




}
