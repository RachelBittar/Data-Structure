package String;

public class Combinations {

	
	public static void combination(String s) {
		combination("", s);
		System.out.println();
	}

	
	private static void combination(String prefix, String s) {
		
		if (s.length() > 0) {
			
			System.out.print(prefix + s.charAt(0)+" ");
			
			combination((prefix + s.charAt(0)), s.substring(1));
			combination(prefix, s.substring(1));
		}
	}

	

	public static void main(String[] args) {			
		String elements = "abc";
		//int r = comb(elements, 0, elements.length());
		//System.out.print(r);
		combination(elements);	
	
		
		
	}

}
