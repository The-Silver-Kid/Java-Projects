import java.util.*

public class CreateWepon {
	public static void main(String args[]) {
		Scanner keyboard = new Scanner(System.in);
		Boolean sax = false;
		
		System.out.println("Do you want a Sword or Battle Ax?")
		System.out.println("Sword = 0.")
		System.out.println("Battle Ax = 1")
		int wC = keyboard.nextInt();
		if (wC == 1) {
			sax = true;
		} else {
			sax = false;
		}
		
		if (sax) {
			System.out.println("");
			System.out.println("Name le sword.");
			String nS = keyboard.nextLine();
			Sword s = new Sword(nS);
		} else {
			System.out.println("");
			System.out.println("Name le Ax");
			String nA = keyboard.nextLine();
			BattleAx a = new BattleAx(nA);
		}
	}
}