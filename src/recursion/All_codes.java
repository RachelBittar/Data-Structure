package recursion;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class All_codes {
	
    //param: number - input integer
    //Return - list() of all codes possible for this number
    

	public static String all_codes(int number) {
		
		char alphabet;
		String output_100 = null;
		String output_10;
		
		  if (number == 0) {
		       return "";
		       
		  }
		  
		  int remainder = number % 100;
		  
		  if (remainder <= 26 && number > 9) {
			  output_100 = (all_codes(number / 100));
			  alphabet = get_alphabet(remainder);

		  }
		  
		  remainder = number % 10;
		  output_10 = all_codes(number /10);
		  alphabet = get_alphabet(remainder);
		  
		  return output_10;
	}
	
//    Helper function to figure out alphabet of a particular number
//    Remember: 
//    * ASCII for lower case 'a' = 97
//    * chr(num) returns ASCII character for a number e.g. chr(65) ==> 'A'
//
	
	public static char get_alphabet(int number) {
    
	    return (char) (number + 96);
	}
	public static void main(String[] args) {
		
		String list;
		list = all_codes(123);
		System.out.println(list);
	}

}
