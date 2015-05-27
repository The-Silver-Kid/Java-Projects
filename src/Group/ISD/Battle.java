package Group.ISD;

public class Battle{
	private Badii badone;
	private int playerhealth;
	private String musik = "/Images/null.png";
	
	public Battle(Badii g, int h, String mk) {
		musik = mk;
		badone = g;
		playerhealth = h;
	}
	
	public void play() {
		//start music playing...
	}
	
	public boolean start() {
		badone.he();
		playerhealth = 1;
		musik = "/Images/lol.png";
		
		return false;
	}

	public int getPlayerhealth() {
		return playerhealth;
	}

	public String getMusik() {
		return musik;
	}
	
}