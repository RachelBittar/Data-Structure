package recursion;

public class Bottom_up {
	
	
 static int fib(int n) {
	 
	 int[] F = new int[50];
	 F[n] = 0;
	 F[1] = 1;

	 for(int i=2; i<=n; i++) {
	      F[i] = F[i-1] + F[i-2];
	  }
	    return F[n];
} 
	
	
 public static void main (String args[]) 
{    
	  System.out.println(System.currentTimeMillis());
	  System.out.println(fib(20));
	  System.out.println(System.currentTimeMillis());
	  
}

/*
 * 
 * # A bottom-up solution
def fib_bottom_up(n):
    if n == 1 or n == 2:
        return 1
    bottom_up = [None] * (n+1)
    bottom_up[1] = 1
    bottom_up[2] = 1
    for i in range(3, n+1):
        bottom_up[i] = bottom_up[i-1] + bottom_up[i-2]
    return bottom_up[n]
 * 
 * */


}
