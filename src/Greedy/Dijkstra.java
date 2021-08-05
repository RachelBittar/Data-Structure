package Greedy;


import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Dijkstra {
	
	
	public static class Node {
		
		int from;
		int to;
		int distance = Integer.MAX_VALUE;
		Node next;
		
		public Node(int from, int distance) {
			super();

			this.from = from;
			this.distance = distance;
			this.next = null;
		}
		
		
	
	}

//	static int minDistance(int dist[], Boolean sptSet[], int n)
//    {
//        // Initialize min value
//        int min = Integer.MAX_VALUE, min_index = -1;
//  
//        for (int v = 0; v < n; v++)
//            if (sptSet[v] == false && dist[v] <= min) {
//                min = dist[v];
//                min_index = v;
//            }
//  
//        return min_index;
//    }
//	
    static int[] shortestReach(int n, int[][] edges, int s) {
    	
    	int[] des = new int[n];
    	int m = edges.length -1;
    	
	    for (int l=0; l<n; l++) {
	    		Node from = new Node(edges[l][0],edges[l][2]);
	    		Node to = new Node(0, edges[l][1]);
	    		
	    		from.next(to);
	    }
    	
    	return des;
    }
    
    static void printSolution(int dist[], int n)
    {
        System.out.println("Vertex   Distance from Source");
        for (int i = 0; i < n; i++)
            System.out.println(i + " tt " + dist[i]);
    }
    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
       // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nm = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nm[0]);

            int m = Integer.parseInt(nm[1]);

            int[][] edges = new int[m][3];

            for (int i = 0; i < m; i++) {
                String[] edgesRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < 3; j++) {
                    int edgesItem = Integer.parseInt(edgesRowItems[j]);
                    edges[i][j] = edgesItem;
                }
            }

            int s = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] result = shortestReach(n, edges, s);

            for (int i = 0; i < result.length; i++) {
                System.out.print(String.valueOf(result[i]));

                if (i != result.length - 1) {
                	System.out.print(" ");
                }
            }

           // bufferedWriter.newLine();
        }

       // bufferedWriter.close();

        scanner.close();
    }
}
