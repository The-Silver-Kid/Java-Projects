package development.Char;

public class Ponii extends Entity {
	
	protected String Mane = "", Tail = "", CutiiMarkPath = "";
	
	public Ponii() {
		System.err.println("PLEASE USE SOMETHING THAT EXTENDS PONII NOT PONII ITSELF");
	}
	
	@Override
	public String getGender() {
		String g = "Stallion";
		if (Gender)
			g = "Mare";
		return g;
	}
	
	public String getMane(){
		return Mane;
	}
	
	public String getTail() {
		return Tail;
	}
	
	public String getCutiiMarkPath(){
		return CutiiMarkPath;
	}
}
