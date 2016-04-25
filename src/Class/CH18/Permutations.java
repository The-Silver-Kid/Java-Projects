package Class.CH18;

/**
 * This program computes permutations of a string.
 */
public class Permutations {
	public static void main(String[] args) {
		/*	for (String s : permutations("eat")) {
				System.out.println(s);
			} */
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
		System.out.println(init);
		T result = null;
		// The empty string has a single permutation: itself
		return result;

	}
}
