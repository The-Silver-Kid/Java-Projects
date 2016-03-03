package Class.DataStruct;

import java.util.LinkedList;
import java.util.Queue;

public class QueuesIntensify {

	public static void main(String[] args) {
		Queue<String> printt = new LinkedList<String>();

		printt.add("Floopis");
		printt.add("schnoopis");
		printt.add("grog is exist");
		printt.add("broopisss");

		System.out.println(printt.remove());
		System.out.println(printt.remove());
		System.out.println(printt.remove());
		System.out.println(printt.remove());
	}
}
