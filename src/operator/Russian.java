package operator;

public class Russian {

	public static void main(String[] args) {
		
		System.out.print(russian(20,7));
		
	}

	static int russian(int a, int b) {
		int x = a; 
		int y = b;
		int z = 0;
		
	    while (x > 0){
	        if (x % 2 == 1) 
	        	z = z + y;
	        y = y << 1; // *2
	        x = x >> 1;	// \2
	      }
	    return z;
	}
}
