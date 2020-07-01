package sort_test;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Fraudulent {

    // Complete the activityNotifications function below.
    static int activityNotifications(int[] expenditure, int d) {
    	
  
        float avg=0,n_avg = 0;
        long sum=0;
        int msg =0;
        int i=0;
        
        // 10 3
        // 3 4 16 1 18 9 6 10 1 6
     
        for(i=0; i<expenditure.length;i++) {
        	if(i<5) {
                 sum = sum + expenditure[i];                 		
        	}
        	
        	avg = sum/(float)5; 
        	System.out.println("Primeira media "+avg);
        	
        	else {
	        	if(expenditure[i]>=(2*avg)) {
	        		System.out.println(avg+" "+expenditure[i]);
	        			try{
	        				
	        				avg = swap(i,expenditure,msg,d);
	        				System.out.println("Segunda media "+avg/(float)5);
	        				msg=msg+1;
	        				System.out.println(msg);
	        				}
	        		    catch(Exception e) {
	        		    	System.out.println(e);
	        		    }
	        			
	        			//System.out.println("Nova media "+avg+" "+expenditure[i]);
	        			
	        			System.out.println(msg);
	            }   	
        	 }
	       }  
        return msg;	
       
    }
      private static int swap(int max, int[]expenditure, int msg ,int d) {

    	  float avg=0;
    	  int sum=0;
    	  
    	  expenditure[msg]=expenditure[max];
    	  for(int i=0; i<5;i++) {
    	    sum = sum + expenditure[i]; 	    
    	  }
        
         System.out.println("Soma " +sum);
         return sum;
        
    }

    	
    

	private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
     
        String[] nd = scanner.nextLine().split(" ");

        int n = Integer.parseInt(nd[0]);

        int d = Integer.parseInt(nd[1]);

        int[] expenditure = new int[n];

        String[] expenditureItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int expenditureItem = Integer.parseInt(expenditureItems[i]);
            expenditure[i] = expenditureItem;
        }

        int result = activityNotifications(expenditure, d);
        System.out.println(result);
        scanner.close();
    }
}
