package Class.CH18;

import java.util.ArrayList;

/**
 * This program computes permutations of a string.
 */
public class Permutations {
	public static void main(String[] args) {
		for (String s : permutations("eat")) {
			System.out.println(s);
		}
	}

	/**
	 * Gets all permutations of a given init.
	 * 
	 * @param init
	 *            the string to permute
	 * @return a list of all permutations
	 */
	public static <T extends Comparable<T>> T permutations(T[] t) {

		T init = t[0];
		ArrayList<T> result = new ArrayList<T>();
		// The empty string has a single permutation: itself
		if (init.length() == 0) {
			result.add(init);
			return result;
		} else {
			// Loop through all character positions
			for (int i = 0; i < init.length(); i++) {
				// Form a shorter init by removing the ith character
				T shorter = init.substring(0, i) + init.substring(i + 1);

				// Generate all permutations of the simpler init
				ArrayList<t> shorterPermutations = permutations(shorter);

				// Add the removed character to the front of
				// each permutation of the simpler init,
				for (String s : shorterPermutations) {
					result.add(init.charAt(i) + s);
				}
			}
			// Return all permutations
			return result;
		}
	}
}
