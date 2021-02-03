package recursion;

public class Power_of_2 {
	
	public static int power_of_2(int n) {
		
		int oup=0;
	    if (n == 0) 
	        return 1;
	   
	     oup = 2 * power_of_2(n - 1);
	   //  System.out.println("-> " + oup + " : "+ n);
	     return oup;
	    
	}

	public static void main(String[] args) {
		
		System.out.println(power_of_2(5));
	}

}
