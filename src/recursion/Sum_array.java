package recursion;

public class Sum_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array[] = { 1, 2, 3, 4, 5 };
		int r = sum_array(array);
		System.out.println(r);
	}

	
	public static int sum_array(int[] array) {
	   
		int i =0;
		int soma=0;

		return array[0] + sum_array(array[1:])
	       
	}
	 
}



