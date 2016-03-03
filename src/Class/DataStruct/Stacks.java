package Class.DataStruct;

/* 1. Jeffrey Worley and Thomas Campana
 * 2. a Stack lies below <<interface>> list in the framework heirarchy
 * 3. Stacks are lists that only allow the top element of the stack to be
 * accessed. To access other elements, The top element of the stack must be
 * removed. Elements are inserted and removed through LIFO (last-in, First-out).
 * The special element of stacks is that other elements can not be interacted
 * with until the top element has been dealt with.
 * 4. Stack<dataType> nameOfStack = new Stack<dataType>();
 * 5. push() adds to the top of the stack.
 * pop() removes the top elements of the stack
 * peek() gets the top of the stack without removing it
 * 6. Stacks can be used in undo functions, run-time stacks of programs,
 * balancing parenthesis, reverse polish calculators, evaluating algebraic
 * expressions, and backtracking.
 * 7. none applicable/none found */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.Stack;

public class Stacks {
	public static void main(String[] args) {

		File inputFile = new File("The_Hobbit.txt");
		Scanner inStuff;
		StackImplementor si;

		try {
			inStuff = new Scanner(inputFile);
			si = new StackImplementor(inStuff);
			si.populateStack();
			si.printStack();

		} catch (FileNotFoundException e) {
			System.out.println("you messed up");
		}

	}

	static class StackImplementor {

		private Scanner in;
		private Stack<String> s = new Stack<String>();

		public StackImplementor(Scanner inStuff) {
			this.in = inStuff;
		}

		public void populateStack() {
			while (in.hasNext()) {
				s.push(in.next());
			}
		}

		public void printStack() {
			while (s.size() > 0) {
				System.out.println(s.pop());
			}
		}

	}
}