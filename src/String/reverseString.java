package String;

import java.util.Scanner;

public class reverseString {

	public static void main(String[] args) {
		
		
	  Scanner sc=new Scanner(System.in);
	  String A=sc.next();
	  
	  boolean flag = false;
	  String r =reverse(A);
	  
	  if(r.equals(A))
		  flag = true;
	  
	  System.out.print(flag);

	}

	private static String reverse(String string) {
		
		 if (string.isEmpty())
	            return string;
	       
	     return reverse(string.substring(1)) + string.charAt(0);
		
	}

}
