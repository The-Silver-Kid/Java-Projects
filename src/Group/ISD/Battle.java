package Group.ISD;

public class Battle{
	private Badii badone;
	private int playerhealth;
	
	
	public Battle(Badii g, int h) {
		badone = g;
		playerhealth = h;
	}
	
	public boolean start() {
		while ((playerhealth >= 1) || (badone.he() >= 1)){
			
		}
		
		return false;
	}
	
}