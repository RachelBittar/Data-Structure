
package String;

import java.util.Scanner;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc=new Scanner(System.in);
		 char[] word=sc.next().toCharArray();
		 
		 System.out.print(Reverse(word));

	}

	private static char[] Reverse(char[] word) {
		
		char[] reverse = word;
		
		int start = 0;
		int end = word.length-1;
		char temp;
		
		
		while((start!=end) && (start<end)) {
			
			temp = reverse[start];
			
			reverse[start] = reverse[end];
			reverse[end] = temp;
			start++;
			end--;
		}
		
		return reverse;
	}

}
