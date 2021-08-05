package JavaBasicTest;

public class fNode {
	
	class Node {

		private int parent = 0;
		private int fs = 0;
		private Node left = null;
		private Node right = null;

		Node(int p, int fs) {
			this.parent = p;
			this.fs = fs;
		}

		public int getParent() {
			return parent;
		}

		public void setParent(int parent) {
			this.parent = parent;
		}

		public int getFs() {
			return fs;
		}

		public void setFs(int fs) {
			this.fs = fs;
		}

		public Node getLeft() {
			return left;
		}

		public void setLeft(Node left) {
			this.left = left;
		}

		public Node getRight() {
			return right;
		}

		public void setRight(Node right) {
			this.right = right;
		}

		public boolean hasRight() {
			if (getRight() == null)
				return false;
			else
				return true;
		}

		public boolean hasLeft() {
			if (getLeft() == null)
				return false;
			else
				return true;
		}
	}


}
