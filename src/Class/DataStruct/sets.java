package Class.DataStruct;

import java.io.File;
import java.io.FileNotFoundException;
/* 1. Mathew, Reggie, Preston
 *
 * 2. The Set interface is a direct subset of the Collection interface.
 *
 * 3. Sets don't care about the order of the elements, so they are able to
 * organize more efficiently.
 * There are two ways of doing this. One is the hash method. To use the hash
 * method, a class needs a
 * working equals() method and a hash code. If each object is unique, these
 * methods can be inherited
 * rom the Object class. There is also TreeSets. TreeSets are still kept in a
 * sorted order. They
 * require elements to be Comparable.
 *
 * Pros:
 * Automatically sorts in its own twisted way
 * Really efficient if you don't care about the order
 *
 * Cons:
 * Can't work with duplicates
 * Doesn't keep an order
 *
 * 4. This is code for declaring two types of sets, HashSet and TreeSet
 * Set<String> names = new HashSet<String>();
 * Set<String> names = new TreeSet<String>();
 *
 * 5. Set<String> names; Declaration for set
 * names.add("Name"); Adda a name to the set (duplicates not allowed)
 * if(names.contains("Name")){} Test if a set contains an element
 * names.remove("Name") Removes the element from an array. If it is not present,
 * an error is received
 *
 * 6. Really good for accessing all of the elements, but without any order to
 * the set. It is good for
 * testing if a certain item is in a database, such as testing if a string is in
 * the dictionary, keeping
 * track of items already processed
 *
 * 7. Don't use duplicates. (It doesn't give you an error, but just ignores it)
 * Make sure it has an
 * equals() method and a hash code if it's a HashSet, or that all elements are
 * Comparable if its
 * a TreeSet. Do not try to remove an element before checking that the element
 * exists in the set, or
 * else you will get an error. */
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

// Checks the bible to see which animals are listed in it
public class sets {
	public static void main(String[] args) throws FileNotFoundException {

		//Send both text files to the readFile method
		Set<String> animals = readFile("animalNames.txt");
		Set<String> bible = readFile("bible.txt");

		//Check each element of the bible Set to see if it is an animal. If it is, display to console.
		for (String word : bible) {
			if (animals.contains(word)) {
				System.out.println(word + " is in the bible");
			}
		}
	}

	//readFile checks the file and makes a set from every word in it
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
