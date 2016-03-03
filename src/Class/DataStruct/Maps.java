package Class.DataStruct;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;
/* Questions
 *
 * 1. Jonathan, Kristopher, Connie
 *
 * 2. It is a seperate interface collection from all of the others with a
 * HashMap and TreeMap class.
 *
 * 3. Maps let you connect a key set with a value collection. You would use a
 * map when you want to find an object/value using a key. Keys are Strings and
 * Values Integer wrappers. If there is no value asscociated with a key, it
 * returns null.
 * Maps are unique because there is a unique code that associates with a value.
 * All of the other collections don't have this ability.
 * The difference between a HashMap and a TreeMap is that the keys are sorted in
 * the TreeMap and is space-efficient whereas a HashMap is not guaranteed to be
 * sorted, but it time-efficient.
 *
 * 4. Map<String, Color> favoriteColors = new HashMap<String, Color>();
 * NEED: import java.util.Map;
 * import java.uitl.Set; // Used for printing all keys and values in the map
 * HashMap: import java.util.HashMap;
 * TreeMap: import java.util.TreeMap;
 *
 * 5. favoriteColors.put("Juliet", Color.RED);
 * // Add association of key and value
 * favoriteColors.put("Juliet", Color.BLUE);
 * // Update associaton of the key to value from red to blue
 * Color julietsFavoriteColor = favoriteColors.get("Juliet");
 * // Returns value of key. If key not present, return = null
 * favoriteColors.remove("Juliet");
 * // Removes key and value
 * for (String key : favoriteColors.keySet()) {
 * Integer value = favoriteColors.get(key);
 * . . .
 * }
 * // Iterates through all map keys and their values
 * System.out.println(favoriteColors);
 * // Prints colors.toString()
 *
 * 6. for a given user on my web server, what is their current session status?
 * for a given word in the document I'm processing, how many times did it occur
 * do far?
 * for a given ID, what is the password?
 * for a given name, what is their favorite
 * color/number/day/month/birthday/pet/animal/...?
 *
 * 7. Use a TreeMap when you need a sorted map. */

public class Maps {

	static int counter = 1;

	public static void main(String[] args) throws FileNotFoundException {
		Map<String, Integer> bibleWords = new TreeMap<String, Integer>();
		Set<String> bible = readFile("bible.txt");

		//Counter doesn't work
		for (String words : bible) {
			if (bibleWords.get(words) == null) {
				bibleWords.put(words, counter);
			} else {
				counter = bibleWords.get(words) + 1;
				bibleWords.put(words, counter);
			}
		}

		Set<String> keySet = bibleWords.keySet();
		for (String key : keySet) {
			int value = bibleWords.get(key);
			System.out.println(key + " was said " + value + " time(s) in the Bible!");
		}
	}

	public static Set<String> readFile(String filename) throws FileNotFoundException {
		Set<String> words = new HashSet<String>();
		Scanner in = new Scanner(new File(filename));

		in.useDelimiter("[^a-zA-Z]+");
		while (in.hasNext()) {
			words.add(in.next().toLowerCase());
		}
		in.close();
		return words;
	}
}
