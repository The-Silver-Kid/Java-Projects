package DevTSK.Entity;

public class Ponii extends Entity {
	
	protected String Mane = "Empty", Tail = "Empty";
	
	public Ponii() {
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
}
