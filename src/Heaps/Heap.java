package Heaps;

import java.util.Arrays;

public class Heap {

	int[] cbt;
	int next_index;

	public Heap(int initial_size) {

		this.cbt = new int[initial_size];
		this.next_index = 0;
	}

	public void _up_heapify() {

		int child_index = this.next_index;

		while (child_index >= 1) {
			int parent_index = (child_index - 1) / 2;

			int parent_element = this.cbt[parent_index];
			int child_element = this.cbt[child_index];

			if (parent_element > child_element) { // troca
				this.cbt[parent_index] = child_element;
				this.cbt[child_index] = parent_element;

				child_index = parent_index;
			} else
				break;

		}

	}

	public void insert(int data) {
		// insert element at the next index
		this.cbt[this.next_index] = data;
		this._up_heapify();
		this.next_index += 1;

		if (this.next_index >= (this.cbt).length) {
			int[] temp = this.cbt;

			this.cbt = new int[2 * (this.cbt).length];

			for (int index = 0; index < this.next_index; index++) {
				this.cbt[index] = temp[index];
			}

		}
	}

	public int size() {
		return this.next_index;
	}

	public int remove() {

		// Remove and return the element at the top of the heap

		if (this.size() == 0)
			return 0;
		this.next_index -= 1;

		int to_remove = this.cbt[0];
		int last_element = this.cbt[this.next_index];

		// place last element of the cbt at the root
		this.cbt[0] = last_element;

		// we do not remove the element m, rather we allow next `insert` operation to
		// overwrite it
		this.cbt[this.next_index] = to_remove;
		this._down_heapify();

		return to_remove;

	}

	private void _down_heapify() {

		int parent_index = 0;

		while (parent_index < this.next_index) {
			int left_child_index = 2 * parent_index + 1;
			int right_child_index = 2 * parent_index + 2;

			int parent = this.cbt[parent_index];
			int left_child = 0;
			int right_child = 0;

			int min_element = parent;

			// check if left child exists
			if (left_child_index < this.next_index) {
				left_child = this.cbt[left_child_index];

				// check if right child exists
				if (right_child_index < this.next_index)
					right_child = this.cbt[right_child_index];

				// compare with left child
				if (left_child != 0)
					min_element = Math.min(parent, left_child);

				// compare with right child
				if (right_child != 0)
					min_element = Math.min(right_child, min_element);

				// check if parent is rightly placed
				if (min_element == parent)
					return;

				if (min_element == left_child)
					this.cbt[left_child_index] = parent;
				this.cbt[parent_index] = min_element;
				parent = left_child_index;

				if (min_element == right_child) {
					this.cbt[right_child_index] = parent;
					this.cbt[parent_index] = min_element;
					parent = right_child_index;
				}
			}
		}
	}
		
		


	public static void main(String[] args) {

		Heap heap = new Heap(10);
		int[] array = {19, 17,13, 11, 7, 5, 3, 2, 1 };

		heap.cbt = array;
		heap._up_heapify();

		heap.insert(10);
		heap.remove();
		
		
		System.out.println(Arrays.toString(heap.cbt));
	

	}

}

/*
 * 
 * 
 * def insert(self, data): # insert element at the next index
 * self.cbt[self.next_index] = data
 * 
 * # heapify self._up_heapify()
 * 
 * # increase index by 1 self.next_index += 1
 * 
 * # double the array and copy elements if next_index goes out of array bounds
 * if self.next_index >= len(self.cbt): temp = self.cbt self.cbt = [None for _
 * in range(2 * len(self.cbt))]
 * 
 * for index in range(self.next_index): self.cbt[index] = temp[index]
 * 
 * 
 */