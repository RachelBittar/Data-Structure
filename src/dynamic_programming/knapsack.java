package dynamic_programming;

public class knapsack {

	int WC = 5;
	static int wm[] = {0, 3, 2, 4, 1};
	static int vm[] = {0, 8, 3, 9, 6};
    
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
				matrix[i][w] = Sum(matrix,i,w);
				}
			}

			return matrix[n][MC];
		}

	private static int Sum(int[][] m, int i, int C) {
		int v=0;
		
		// wi > w, we can't pick it
		// F(i,w) = F(i-1, w)
		//remove i, keep current w 
		
		if(wm[i] > C) {
			m[i][C] = m[i-1][C]; 
			v=m[i][C];
		}
		
		// we can pick the item
		// comparing F(i-1, w) with F(i-1, w-wi)
		// remove i update weight
		else { 	 
			if (vm[i] + m[i-1][C-wm[i]] > m[i-1][C]) {
				m[i][C] = vm[i] + m[i-1][C-wm[i]];
				v=m[i][C];
			}
			else {
				m[i][C] = m[i-1][C];
				v=m[i][C];
			}
		}

		return v;
	}

	public static void main(String[] args) {

		int C = 5;
		int wm[] = {0, 12, 2, 4, 1};
		int vm[] = {0, 8, 3, 9, 6};
		System.out.println(knapsack01(wm.length-1, C, wm, vm));
	}
}