import java.util.*;

public class Arrai {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		int ammount, sides;
		int[] result;
		Random rn = new Random();
		
		System.out.println("Input number of dice to be thrown");
		ammount = keyboard.nextInt();
		result = new int[ammount];
		System.out.println("");
		System.out.println("Input amount of sides to the dice (2-100)");
		sides = keyboard.nextInt();
		keyboard.close();
		System.out.println("");
		System.out.println("Running...");
		for (int i = 0; i < result.length; i++) {
			result[i] = rn.nextInt(sides) + 1;
			System.out.println((i+1) + " : " + result[i]);
		}
	}
}