package recursion;

public class Factorial {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int result = factorial(0);		 
		 System.out.println(result);
	}

	private static int factorial(int i) {
		if(i==0) return 0;
		if(i==1) return 1;
		return i* factorial(i-1);
	}
}
