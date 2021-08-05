package recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/*
 * 
 * Euclid's algorithm. 
 * The greatest common divisor (gcd) of two positive integers is the largest
 * integer that divides evenly into both of them. 
 * For example, the gcd(102, 68) = 34.
 * We can efficiently compute the gcd using the following property,
 * which holds for positive integers p and q:
 * 
 * If p > q, the gcd of p and q is the same as the gcd of q and p % q.
 * The static method gcd() in Euclid.java is a compact recursive 
 * function whose reduction step is based on this property.
 * */


public class Gcd {
	
	// recursive implementation
    public static int gcd(int p, int q) {
        if (q == 0) return p;
        else return gcd(q, p % q);
    }

    // non-recursive implementation
    public static int gcd2(int p, int q) {
        while (q != 0) {
            int temp = q;
            q = p % q;
            p = temp;
        }
        return p;
    }

    public static void main(String[] args) {
    	
     Scanner scanner = new Scanner(System.in);
     int p  = scanner.nextInt();
     int q  = scanner.nextInt();
     int d  = gcd(p, q);
     System.out.println("gcd(" + p + ", " + q + ") = " + d);
     
    }


}
