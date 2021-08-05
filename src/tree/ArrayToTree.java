package tree;

import java.util.ArrayList;
import java.util.List;

public class ArrayToTree { 

	static int sum=0;
	static int sumL =0;
	
    Node root; 
  
    static class Node { 
        int index;
        int fs;
        Node left;
        Node right;
        
        Node(int index, int fs) 
        { 
            this.index = index;
            this.fs = fs;
            this.left = null; 
            this.right = null; 
        } 
    } 
  
    
    public Node add(List<Integer> leafList, Node root,  int leaf) 
    { 
        
        if (leaf < leafList.size()) { 
        	
            Node node = new Node(leaf, leafList.get(leaf)); 
            root = node; 

            root.left  = add(leafList, root.left, (2 * leaf + 1)); 
            root.right = add(leafList, root.right,(2 * leaf + 2)); 
        }
        
        return root; 
    } 
  
 
    public void Add(Node root) 
    { 
 
        if (root != null) { 
        	Add(root.left);
        	sum = sum+(root.index + root.fs);
        	if(root.index==0) {
        		sumL=sum;
        		sum=root.fs;
        	}
     
        	System.out.print((root.index + root.fs) + " - Total: "+sum+"\n");
            Add(root.right); 
            
        } 
       
    } 
  
   
    public static void main(String args[]) 
    { 
        ArrayToTree tree = new ArrayToTree(); 
       
        List<Integer> leafList = new ArrayList();
        leafList.add(7);
        leafList.add(1);
        leafList.add(1);
        leafList.add(3);
        leafList.add(3);
        leafList.add(3);
        
        tree.root = tree.add(leafList, tree.root, 0); 
        tree.Add(tree.root); 
        
  
      
        
       
    } 
} 