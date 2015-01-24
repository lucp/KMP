package kmp;

public class KMP {

	public static int[] generateTable(String pattern) {
		int length = pattern.length();
		int[] table = new int[length];
		table[0] = -1;
		table[1] = 0;
		int position = 2;
		int candidate = 0;
		while (position < length) {
			if (pattern.charAt(position - 1) == pattern.charAt(candidate)) {
				candidate += 1;
				table[position] = candidate;
				position += 1;
			}
			else if (candidate > 0) {
				candidate = table[candidate];
			}
			else {
				table[position] = 0;
				position += 1;
			}
		}
		return table;
	}
	
	public static int search(String text, String pattern) {
		int match = 0;
		int position = 0;
		int[] table = KMP.generateTable(pattern);
		while (match + position < text.length()) {
			if (pattern.charAt(position) == text.charAt(match + position)) {
				if (position == pattern.length() - 1) return match;
				position += 1;
			}
			else {
				if (table[position] > -1) {
					match += position - table[position];
					position = table[position];
				}
				else {
					position = 0;
					match += 1;
				}
			}
		}
		return -1;
	}
	
}
