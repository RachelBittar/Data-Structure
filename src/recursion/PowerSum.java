package recursion;

import java.util.ArrayList;
import java.util.List;

public class PowerSum {

	public static void main(String[] args) {
		
		
		  int result = powerSum(9,3);
		  System.out.println(result);
	}

	static int powerSum(int X, int N) {
		
		int div = (int) (1.0/N); //Inverse exp to get square.
		
        int base = (int) (Math.pow(X, div)+1); // square
        
        System.out.println(base);
        
        int[] ps = new int[X+1];
        ps[0] = 1;
        
        for(int i = 1; i <= base; ++i){ // interating base
        	
            int pow = (int)Math.pow(i, N);
            System.out.println("pow "+pow);
            
            for(int j = X; j >= pow; j--){
                ps[j] += ps[j-pow];
                System.out.println("ps[j] "+ps[j]);
            }
        }
        System.out.println("ps[j] "+ps[X]);
        return ps[X];
    }

}
