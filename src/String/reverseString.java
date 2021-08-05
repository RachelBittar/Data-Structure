package String;

import java.util.Scanner;

public class reverseString {

	static int i=0;
	public static void main(String[] args) {
		
		
	  Scanner sc=new Scanner(System.in);
	  String orginal=sc.next();
	  
	  boolean flag = false;
	  String reverse = Reverse(orginal);
	  
	  if(reverse.equals(orginal))
		  flag = true;
	  
	  System.out.print(flag);

	}

	private static String Reverse(String org) {
		
		
		 if (org.isEmpty())
	            return org;
	     
		 System.out.print(i+" "+org.substring(1)+"\n");
		 i++;
	     return Reverse(org.substring(1)) + org.charAt(0);
		
	}

}
