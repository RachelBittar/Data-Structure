package operator;

public class And {

	public static void main(String[] args) {
		
	  
		int x = 5, y = 7, z = 9;

		System.out.println("Demonstrating && operator");
		if ((x > y) && (x++ > z))
			;
		else
			System.out.println("Value of x: " + x);

		System.out.println("\nDemonstrating & operator");
		if ((x > y) & (x++ > z))
			;
		else
			System.out.println("Value of x: " + x);
		
		int a = 2; 
        int b = 4; 
  
      //  System.out.println("a "+ a + " "+ Integer.toBinaryString(a));
      //  System.out.println("b "+ b + " "+ Integer.toBinaryString(b));
        
        System.out.println("Demonstrating & operator\n"); 
        int c = a & b; 
        System.out.println(a + " & " + b + " = " + c); 
        
        
        int ab = 2; 
        int bb = 4; 
  
          
        System.out.println("Demonstrating >> operator\n"); 
        int cb = 17 >> 2; 
        System.out.println(cb);
        
        

	}

}
