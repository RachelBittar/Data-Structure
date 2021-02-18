package String;

public class PalindromePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String phrase = "0P";
		System.out.println(isPermutationOfPalindrome(phrase));
	}

	static boolean isPermutationOfPalindrome(String phrase) {
		
		int[] table = buildCharFrequencyTable(phrase);
		return checkMaxOneOdd(table);
	}

	/* Check that no more than one character has an odd count. */
	static boolean checkMaxOneOdd(int[] table) {
		boolean foundOdd = false;
		for (int count : table) {
			if (count % 2 == 1) {
				if (foundOdd) {
					return false;
				}
				foundOdd = true;
			}
		}
		return true;
	}

	/*
	 * Map each character to a number. a -> 0, b -> 1, c -> 2, etc. This is case
	 * insensitive. Non-letter characters map to -1.
	 */
	static int getCharNumber(Character c) {
		int a = Character.getNumericValue('0');
		int z = Character.getNumericValue('Z');
		int val = Character.getNumericValue(c);
		if (a <= val && val <= z) {
			return val - a;
		}
		return -1;
	}

	/* Count how many times each character appears. */
	static int[] buildCharFrequencyTable(String phrase) {
		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('0') + 1];
		for (char c : phrase.toCharArray()) {
			int x = getCharNumber(c);

			if (x != -1) {
				table[x]++;
			}
		}
		return table;
	}

}
