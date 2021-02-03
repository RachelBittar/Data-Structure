//implement sum_integers(n) to calculate the sum of all integers 
//from  1  to  𝑛  using recursion. 
//For example, sum_integers(3) should return  6  ( 1+2+3 )

package recursion;

import java.io.IOException;
import java.util.Scanner;

public class RecursiveDigitSum

{

	 public static void main(String[] args) throws IOException {
	      
	       int result = recursiveDigitSum("148",3);
	       System.out.println(result);

	        
	    }

	private static int recursiveDigitSum(String n, int k) {

  	    int i=0;
        int soma=0; 

   
       while(i<n.length()) {
             //System.out.println("-> " + n);
             soma = soma + Character.getNumericValue(n.charAt(i));
             i++;
         }
         
        if(k%10==0) k=1;
        soma = soma*k;
        
        if (String.valueOf(soma).length()>1) {
            System.out.println(soma);
            return recursiveDigitSum(String.valueOf(soma), 1);
        }
        else return soma;
	}


	
	
}
