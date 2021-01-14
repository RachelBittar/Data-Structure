package dynamic_programming;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

import dynamic_programming.IntervalSchedulling.Request;

public class WIS {
	static class Request { 
		int start, end, profit;

		Request(int start, int end, int profit) {
			this.start = start;
			this.end = end;
			this.profit= profit;
		}
	}	
	
	
	public static int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
	

		ArrayList<Request> p = new ArrayList<>();
		
		int[] ovl  = new int [startTime.length+1];
		int[] r  = new int [startTime.length+1];
		int[] w  = new int [startTime.length+1];
		int sum=0;
		
		
		Request request_init = new Request(0,0,0);
			p.add(0,request_init);

		for (int i = 0; i <startTime.length; i++) {
			Request request = new Request(startTime[i],endTime[i],profit[i]);
			p.add(request);
		}


		Collections.sort(p, new Comparator<Request>() {   //ordenate by ft
			public int compare(Request a, Request b) 
			{ 
				return  a.end - b.end; 
			} 
		}); 
		
		
		ArrayList<Integer> no = new  ArrayList<Integer>();
		
		int y=1;
			
		ovl[0]=0;
		  w[0]=0;
		int memo = 0;
		int is=0;
		
		while (y <p.size()) {
			
			int prevEnd  = p.get(y - 1).end;
			int currStart = p.get(y).start;
					
			if (prevEnd > currStart || ) {
                if(p.get(y).profit > no.get(is).profit) {
                is++;
               	p.remove(y-1);
            }
              
                else p.remove(y);
                                
			}
			no.add(p.get(y));
			y++;
		}
		
		for (int i = 1; i < p.size(); i++) { 
			if(p.get(i)!=request_init) {
	        System.out.println(i+"-->[" + p.get(i).start +  
	                          ", " + p.get(i).end + "]="+p.get(i).profit); 
	        }
	    } 
		
		
		int x=0;
		int c=1;
		for(int i=0; i<p.size(); i++) {
			if(p.get(i)!=request_init){
				ovl[x]=c;
				c++;		
			}
			x++;
		}
	
			
		
		
		
		System.out.println(Arrays.toString(ovl));
		
		
		for (int j = 1; j< no.size(); j++) { 
			w[j]=no.get(j).profit;
	     	r[j] = Math.max(w[j]+ r[ovl[j]],r[j-1]);
	     	//sum = Math.max(sum,r[j]);
		}
		System.out.println(Arrays.toString(w));
		System.out.println(Arrays.toString(r));
		
	
		//System.out.println();
		return  sum;
		
		
		
        
    }

	public static void main(String[] args) throws IOException {

												
	int[] startTime = {1,2,3,4,6};				   
	int[] endTime =   {3,5,10,6,9};					
	int[] profit =    {20,20,100,70,60};
													
	int res = jobScheduling(startTime,endTime,profit);
															
	System.out.println(res);

}
}
