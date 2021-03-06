package recursion;

import java.util.Scanner;

public class Collatz {

	
	
	public static void collatz(int n) {
	
	    System.out.print(n + " "); 
	    
	    if (n == 1)
	    	return;
	    if (n % 2 == 0)
	    	collatz(n / 2);
	    else 
	    	collatz(3*n + 1);
	}
	
	
	public static void main(String[] args) {
		
	//	Scanner scanner = new Scanner(System.in);
     //   int n = scanner.nextInt();
        
        //while(n>0) {
        	// int c = scanner.nextInt();
        	 collatz(1);
        	// n--;
        //}

	
	}
}
