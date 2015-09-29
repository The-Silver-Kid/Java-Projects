package development.Char;

public class Ponii extends Entity {
	
	protected String Mane = "Empty", Tail = "Empty", CutiiMarkPath = "Empty";
	
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
	
	public String getCutiiMarkPath(){
		return CutiiMarkPath;
	}
}
