package recursion;

import java.util.Scanner;

/*
 * Write a program IntegerToBinary.java 
 * that takes a positive integer n (in decimal) 
 * as a command-line argument and prints its binary
 * representation. 
 * Recall, in Binary.java, we used the method of subtracting out
 * powers of 2. Now, use the following simpler method:
 * repeatedly divide 2 into n and read the remainders backwards.
 * 
 * First, write a while loop to carry out this computation and 
 * print the bits in the wrong order.
 *  
 * Then, use recursion to print the bits in the correct order.
 * */
public class BinaryRepresentation {

	 public static void convert(int n) {
		 
	     if (n == 0) 
	    	 return;
	    
	     convert(n / 2);
	     System.out.print(n % 2+" ");
	 }

	  public static void main(String[] args) {
		  
		  	Scanner scanner = new Scanner(System.in);
	        int n = scanner.nextInt();
	        if(n!=0)
	        	convert(n);
	        else
	        System.out.print(0);
	    }


}
