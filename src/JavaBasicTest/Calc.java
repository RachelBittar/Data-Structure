package JavaBasicTest;

import java.util.Scanner;

abstract class Calculator{

	abstract int add(int n1, int n2);


}

class Adder extends Calculator{
	
	public int add(int a, int b) {
		
		return (a+b);
	}
	
	
}



public class Calc {
    public static void main(String[] args) {
        int a, b;
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.nextInt();
            b = scan.nextInt();
        }

        Calculator adderObject = new Adder();
        System.out.println("The sum is: " + adderObject.add(a, b));
    }
}