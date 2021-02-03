package recursion;

public class Sum_integers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 System.out.println(sum_integers(2)); // 2 + 1 
	}	 	
	
	//f(5) = 5 + f(4)
	
	public static int sum_integers(int n) {
	    if (n == 1) {
	        return 1;
	    }
	    
	    if (n == 0) {
	        return 0;
	    }
	    return n + sum_integers(n -1);
	}

}
