package sort;

class Quick {
	  public static int partition(int a[], int start, int end) {
	    int pivot = a[end];
	    int i = start-1;

	    for(int j=start; j<=end-1; j++) {
	      if(a[j]<=pivot) {
	        i=i+1;
	        int temp = a[j];
	        a[j] = a[i];
	        a[i] = temp;
	      }
	    }
	    int temp = a[i+1];
	    a[i+1] = a[end];
	    a[end] = temp;
	    return i+1;
	  }

	  public static void quicksort(int a[], int start, int end) {
	    if(start < end) {
	      int q = partition(a, start, end);
	      quicksort(a, start, q-1);
	      quicksort(a, q+1, end);
	    }
	  }

	  public static void main(String[] args) {
	    int a[] = {4, 8, 1, 3, 10, 9, 2, 11, 5, 6};
	    quicksort(a, 0, 9);

	    //printing array
	    for(int i=0; i<10; i++) {
	      System.out.print(a[i]+" ");
	    }
	    System.out.println("");
	  }
	}