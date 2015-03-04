import java.util.*;
import java.io.*;

public class Box {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		float tL, tW, tH, tSA, tV;
		
		System.out.println("Input Length.");
		tL = keyboard.nextFloat();
		System.out.println("Input Width.");
		tW = keyboard.nextFloat();
		System.out.println("input Height.");
		tH = keyboard.nextFloat();
		
		MakeBox bOne = new MakeBox(tL, tW, tH);
	}
}