package JavaBasicTest;

public class FizzBuzz {
	
	
	

	public static void main(String[] args) {
		
		
		fizzbuzz(15);

	}

	 static void fizzbuzz(int n) {

		for (int i=1;i<n+1;i++) { 
			
	    if (((i % 3) == 0) && ((i % 5) == 0)) 
	         System.out.println("FizzBuzz");
	     else if ((i % 3) == 0 && !((i % 5) == 0)) 
	       System.out.println("Fizz");
	     else if (!((i % 3) == 0) && ((i % 5) == 0))
	        System.out.println("Buzz");
	     else
	        System.out.println(i); 
	    }
		 
	 }
	 
	 
	 
	 
	

}

