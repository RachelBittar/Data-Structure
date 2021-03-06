package String;

public class Check_Permutation {

	public static void main(String[] args) {
		System.out.println(permutation("ab", "eidboaoo"));
	}

	static String sort(String s) {
		char[] content = s.toCharArray();
		java.util.Arrays.sort(content);
		return new String(content);
	}

	static boolean permutation(String s, String t) {

		if (s.length() == t.length())
			return sort(s).equals(sort(t));
		
		else {
			if (s.length() > t.length()) {
				s = removeLastCaracter(sort(s));
				return permutation(s, t);
			} else {
				t = removeLastCaracter(sort(t));
				return permutation(s, t);
			}
		}
	}

	private static String removeLastCaracter(String str) {
		return str.substring(0, str.length() - 1);

	}

}
