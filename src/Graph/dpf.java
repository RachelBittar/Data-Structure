package Graph;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.Stack;

import org.w3c.dom.Node;

public class dpf {
	
	
	public static void dpfPrint(Node node) {
		
		Stack<Integer> stack = new Stack<>();
		Set<Node> seen = new HashSet<>();
		
		
		stack.push(start);
		
		while(!stack.empty()) {
			
			Node cur = stack.pop();
			
			if(!seen.contains(cur)) {
				seen.add(cur);
				System.out.print(cur);
			}
			
			for(Node adj: cur) {
				if(!seen.contains(adj)) {
					stack.push(adj);
				}
			}
			
		}
		
	}

	 private static final Scanner scanner = new Scanner(System.in);

	    public static void main(String[] args) {
	        String[] tbfc = scanner.nextLine().split(" ");

	        int t = Integer.parseInt(tbfc[0]);

	        int b = Integer.parseInt(tbfc[1]);

	        int f = Integer.parseInt(tbfc[2]);

	        int c = Integer.parseInt(tbfc[3]);

	        // Write Your Code Here

	        scanner.close();
	    }

}
