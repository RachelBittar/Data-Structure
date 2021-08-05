package String;

public class unique_characters {

	public static void main(String[] args) {

		String ss = "bcd";
	
		
		if (isUniqueChars(ss))
			System.out.println("\nYes");
		else
			System.out.println("\nNo");
		return;

	}
	
	static boolean isUniqueChars(String str) {

		int checker = 0;
		int val;

		for (int i = 0; i < str.length(); i++) {
			val = str.charAt(i) - 'a'; //(-97)
			System.out.println(val);
			
			if ((checker & (1 << val)) > 0) {
				System.out.println("B "+ (1 << val));
				return false;
			}
			
			checker += (1 << val);
			System.out.println("Checker " + checker);
		}
		return true;
	}

}
