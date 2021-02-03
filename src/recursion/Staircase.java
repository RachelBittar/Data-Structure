package recursion;

/*
 * Problem Statement
Suppose there is a staircase that you can climb in either 1 step, 2 steps, or 3 steps. In how many possible ways can you climb the staircase if the staircase has n steps? Write a recursive function to solve the problem.

Example:

n == 1 then answer = 1

n == 3 then answer = 4
The output is 4 because there are four ways we can climb the staircase:

1 step + 1 step + 1 step
1 step + 2 steps
2 steps + 1 step
3 steps
n == 5 then answer = 13
 * 
 * 
 * */
public class Staircase {
	
	public static int staircase(int n) {
	    if (n <= 0)
	       return 1;
	    if (n == 1)
	        return 1;
	    if (n == 2)
	        return 2;
	    if (n == 3)
	        return 4;
	    
	    return staircase(n - 1) + staircase(n - 2) + staircase(n - 3);
	    // 3+2+1 =7
	    //9: 8 + 7 + 6
	    
	    //6: 5 + 4 + (3)-> (13) + (7) + (4)-> 24 
	    //4: 3 + 2 + 1  -> (4)+(2)+(1) = 4->(7)
	    //5: 4+3+2      -> (7)+(4)+(2) = 5->(13)
	
	
	}	//
	
    static int stepPerms(int n) {
        
    int[] stair = new int[n+1]; 		
    
    stair[1]=1;
	if(n >= 3) 
		stair[3] = 4; 
	if(n >= 2) 
		stair[2] = 2;   

    for(int i = 4; i <= n; i++)
        stair[i] = stair[i-1]+ stair[i-2]+ stair[i-3];
        
        return stair[n];        
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    	
	    	//int result = staircase(39);
	    	//System.out.println(result);
	    	
	    	int result = stepPerms(8);
	    	System.out.println(result);

	}

}
