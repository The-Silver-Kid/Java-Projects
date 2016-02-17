package Class.CH14.thing;

/**
 * This class sorts an array, using the merge sort
 * algorithm nonrecursively.
 */
public class MergeSorter {
	public static void sort(int[] a) {
		int length = 1; // The size of the sorted areas; a power of 2

		while (length <= a.length) {
			int start = 0; // sort starts at the beginning of the array

			while (start + 2 * length <= a.length) {
				// Merge all adjacent areas of size length
				// into sorted areas of size 2 * length
				merge(start, start + length - 1, start + 2 * length - 1, a);
				start = start + 2 * length;
			}

			// If there were some elements that weren't sorted in
			// this pass, then sort them now
			if (start + length <= a.length) {
				merge(start, start + length - 1, a.length - 1, a);
			}
			length = length * 2; // Double the size of the next sort areas
			start = 0; // Start the sort pass at the beginning of the array
		}
	}

	public static void merge(int from, int mid, int to, int[] a) {
		int n = to - from + 1;
		// Size of the range to be merged

		// Merge both halves into a temporary array b

		// Next element to consider in the first half

		// Next element to consider in the second half
		// Next open position in b

		// As long as neither i1 nor i2 past the end, move
		// the smaller element into b

		// Note that only one of the two while loops
		//  below is executed

		// Copy any remaining entries of the first half

		// Copy any remaining entries of the second half

		// Copy back from the temporary array

	}
}
