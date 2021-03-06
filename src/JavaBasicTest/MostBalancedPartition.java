package JavaBasicTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Node {
	
	int size;
	int total; 
	int index; 
	Node[] children;
	
	public Node(int index, int size) {
     this.size  = size;
     this.total = size;
     this.index = index;
	}
 
}


public class MostBalancedPartition {
	
	public static void main(String[] args) throws IOException {
		
	 int[] parents = {-1,0,1,2};
	 int[] fs = {1,4,3,4};
	 
	 int result = mostBalancedPartition(parents, fs);
	 System.out.print(result);
	 
	 
	
	}

	public static int mostBalancedPartition(int[] parents,int[] fs) { 
		
		 Node[] nodes = new Node[parents.length];
		 Node root = null;
		 
		   for(int i = 0; i < parents.length; ++i) {
		        Node node = new Node(i, fs[i]);
				nodes[i] = node;
		        if(parents[i] != -1) {
		        	int p = parents[i];
		        	nodes[p].children[];
		        } else {
		            root = node;
		        }
		    }
		    int total = calculateTotal(root);
		    int diff = total;
		    mostBalancedUtil(root, total, diff);
		    return diff;
		  
	}

  static void mostBalancedUtil(Node root, int total, int diff) {
		  if(root == null) return;
		    int d = Math.abs(total - 2 * root.total);
		    if(d < diff) diff = d;
		    for(Node child : root.children)
		        mostBalancedUtil(child, total, diff);	
	}

	static int calculateTotal(Node root) {
		if(root.children==null) return root.size;
	    for(Node node : root.children) {
	        root.total += calculateTotal(node);
	    }
	    return root.total;
	} 
	

}


    
/*	
struct Node
{
    int size; // the size of the directory excluding the subdirectories
    int total; // the total file size of its children and itself
    int index; // index of tree
    vector<Node*> children;
    Node(int index, int size)
        :
        size(size),
        total(size),
        index(index)
    {}
};
int calculateTotal(Node* root)
{
    if(root->children.empty()) return root->size;
    for(Node* node : root->children) {
        root->total += calculateTotal(node);
    }
    return root->total;
}
void mostBalancedUtil(Node* root, const int total , int& diff)
{
    if(root == NULL) return;
    int d = abs(total - 2 * root->total);
    if(d < diff) diff = d;
    for(Node* child : root->children)
        mostBalancedUtil(child, total, diff);
}
int mostBalancedPartition(vector<int> parent, vector<int> files_size) {
    vector<Node*> nodes(parent.size());
    Node* root = NULL;
    for(int i = 0; i < parent.size(); ++i) {
        Node* node = new Node(i, files_size[i]);
        nodes[i] = node;
        if(parent[i] != -1) {
            nodes[parent[i]]->children.push_back(node);
        } else {
            root = node;
        }
    }
    int total = calculateTotal(root);
    int diff = total;
    mostBalancedUtil(root, total, diff);
    return diff;
}
int main()
{
    int parent_count; cin >> parent_count;
    vector<int> parent(parent_count);
    for (int i = 0; i < parent_count; i++) {
        cin >> parent[i];
    }
    int files_size_count; cin >> files_size_count;
    vector<int> files_size(files_size_count);
    for (int i = 0; i < files_size_count; i++) {
        cin >> files_size[i];
    }
    int result = mostBalancedPartition(parent, files_size);
    cout << result << "\n";
    return 0;
}

 
*/

