package recursion;

public class Reverse_string {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String str = reverse_string("input");
		
		//String str = is_palindrome("input");
		System.out.println(is_palindrome("arara"));

	}
	
	
	public static String reverse_string(String input) {
		
		int len = input.length(); 
		if(len==0) return "";
		
		String first_char = String.valueOf(input.charAt(0));
		String the_rest = input.substring(1,len);
		
		String reverse = reverse_string(the_rest);
		
	   return reverse.concat(first_char);
	}
	
	public static boolean is_palindrome(String input) {
		
		int len = input.length(); 
		
		if (len <= 1) {
	        return true;
	    }
	    else 
	    {
	    	String first_char = String.valueOf(input.charAt(0));
	    	String last_char = String.valueOf(input.charAt(len -1));
	    	String middle = input.substring(1,len-1);
	    	
	    	System.out.println(middle);
	    	
	    	boolean cp = new String(first_char).equals(last_char);
	        return (cp && is_palindrome(middle));
	    }

	    
	}

}
