package String;



/*
 * that two command-line arguments n and k, 
 * and prints out all P(n,k)=n!(n−k)! 
 * permutations that contain exactly k of the n elements.
 * Below is the desired output when k = 2 and n = 4 
 * (again, do not worry about the order): * 
 * */
public class PermutationsK {

	public static void choose(char[] a, int k) {
        enumerate(a, a.length, k);
    }

    private static void enumerate(char[] a, int n, int k) {
    	
        if (k == 0) {
        	
            for (int i = n; i < a.length; i++)
            	System.out.print(a[i]);
            
            System.out.println();
            return;
        }

        for (int i = 0; i < n; i++) {
            swap(a, i, n-1);
            enumerate(a, n-1, k-1);
            swap(a, i, n-1);
        }
    }  

    // helper function that swaps a[i] and a[j]
    public static void swap(char[] a, int i, int j) {
        char temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }


    // sample client
    public static void main(String[] args) {
        
        int k = 2;
        String elements = "abc";
        int n = elements.length();

        char[] a = new char[n];
        for (int i = 0; i < n; i++)
            a[i] = elements.charAt(i);
        
        choose(a, k);
    }

}
