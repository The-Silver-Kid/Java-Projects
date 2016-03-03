package Class.DataStruct;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by 9485974 on 2/25/2016.
 */
public class LinkedLists {
	//Names: Alex, Calvin, Bernard
	//Linked list resides at the bottom of the interface collection and the interface queue
	/*LinkedLists seem to be useful because they are similar to arrayLists, you do not have to specify
	size or location when adding new data, you simply *plop* it in. This functionality also allows you to remove data
	from a linked list without altering the index position of any other elements.
	 */
	//LinkedList listNamae = new LinkedList();
	/*listNamae.add(Element) - Allows us to add new thigns.
	listNamae.addFirst() - Adds the element at the beginning of the list.
	listNamae.addLast() - Adds the element at the end of the array.
	listNamae.clear() - Removes all elements from the list
	listNamae.contains() - Checks to see if the list contains a certain element
	listNamae.clone() - clones the list
	listNamae.remove(indexStart, indexEnd) - removes all data between these two points
	 */
	//This data type would be particularly useful if you needed to use an arrayList but you needed extra functionality that allows you to add and remove elements without any negative consequences.
	//Always use camelCasing, the list can get quite long and unmanaged if used and altered too frequently, if you need to search for a specific object after storing it you should use another type of list.

	public void groceries(LinkedList<String> list) {
		boolean done = false;
		Scanner scanner = new Scanner(System.in);
		while (!done) {
			System.out.println("What do you need from the grocery store? (Type 'finished' when done)");
			String input = scanner.nextLine();
			if (input.equals("finished")) {
				System.out.println("Finished");
				done = true;
			} else {
				list.add(input);
			}
		}
		scanner.close();
	}

	public void printGroceryList(LinkedList<String> list) {
		for (Object s : list) {
			System.out.println(s.toString());
		}

	}

	public static void main(String[] args) {
		LinkedLists groceryList = new LinkedLists();
		LinkedList<String> list = new LinkedList<String>();
		groceryList.groceries(list);
		groceryList.printGroceryList(list);
	}
}
