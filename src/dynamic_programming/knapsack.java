package dynamic_programming;

public class knapsack {


	private static int knapsack01(int n, int MC, int wm[], int vm[]) {

		int[][] matrix = new int[n+1] [MC+1];
		// number of elements + 1 {0}
		// Max Capacity + 1 {0}

		for(int w=0; w<=MC; w++) {  // Initializing first row -> 0 
			matrix[0][w] = 0;       // Until Max Capacity
		}

		for(int i=0; i<=n; i++) {
			matrix[i][0] = 0;      // Initializing first column -> 0
		}					       // Until Max element


		for(int i=1; i<=n; i++) {	
			for(int w=1; w<=MC; w++) {  //F(i,j)
									   	
					if(wm[i] > w) {
						matrix[i][w] = matrix[i-1][w]; // wi > w, we can't pick it
						// F(i,w) = F(i-1, w), remove i, keep w [0]
					}
					else { // we can pick the item
						if (vm[i] + matrix[i-1][w-wm[i]] > matrix[i-1][w]) {
							matrix[i][w] = vm[i] + matrix[i-1][w-wm[i]];
							// comparing F(i-1, w) with F(i-1, w-wi)
							// remove i update weight
						}
						else {
							matrix[i][w] = matrix[i-1][w];
						}
					}

				}
			}

			return matrix[n][MC];
		}

	public static void main(String[] args) {

		int WC = 5;
		int wm[] = {0, 2, 3, 4, 5};
	    int vm[] = {0, 3, 7, 2, 9};
		System.out.println(knapsack01(4, 5, wm, vm));
	}
}