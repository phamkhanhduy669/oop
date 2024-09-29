import java.util.HashSet;
import java.util.Set;

// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		if (str == null || str.isEmpty()) {
			return 0;
		}

		int maxLength = 1;
		int currentLength = 1;

		for (int i = 0; i < str.length()-1; i++) {
			if (str.charAt(i) == str.charAt(i + 1)) {
				currentLength++;
				maxLength = Math.max(maxLength, currentLength);
			}
			else {
				currentLength = 1;
			}
		}

		return maxLength; // YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		int length = str.length();
		String result = "";

		for (int i = 0; i < length; i++) {
			if (i == length - 1 && Character.isDigit(str.charAt(i))) {
				return result;
			}
			char currentChar = str.charAt(i);
			if (Character.isDigit(currentChar)) {
				int count = Character.getNumericValue(currentChar);
				if (count > 1) {
					char nextChar = str.charAt(i + 1);
					for (int j = 0; j < count; j++) {
						result += nextChar;
					}
				}
			}
			else {
				result += currentChar;
			}
		}

		return result; // YOUR CODE HERE
	}
	
	/**
	 * Given 2 strings, consider all the substrings within them
	 * of length len. Returns true if there are any such substrings
	 * which appear in both strings.
	 * Compute this in linear time using a HashSet. Len will be 1 or more.
	 */
	public static boolean stringIntersect(String a, String b, int len) {
		if(a == null || b == null || len == 0) {
			return false;
		}
		Set<String> set = new HashSet<>();

		for (int i = 0; i < len; i++) {
			set.add(a.substring(i, i + len));
		}
		for (int i = 0; i < len; i++) {
			if (set.contains(b.substring(i, i + len))) {
				return true;
			}
		}

		return false; // YOUR CODE HERE
	}
}
