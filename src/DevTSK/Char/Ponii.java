package DevTSK.Char;

public class Ponii {
	private int age = 0, nc = 0, state = 0;
	private String name = "", desc = "", cutii = "", m = "", f = "", mt = "";
	private String[] c = null;
	private String impath = "/null.png";
	
	public Ponii(String n, String d, String cm, String mother, String father, String mato, int aje, int chl, String[] childnames, String imm) {
		state = 1;
		name = n;
		desc = d;
		cutii = cm;
		m = mother;
		f = father;
		mt = mato;
		age = aje;
		nc = chl;
		c = childnames;
		impath = imm;
	}
	
	public Ponii(String n, String d, String cm, String mother, String father, int aje, String imm) {
		state = 2;
		name = n;
		desc = d;
		cutii = cm;
		m = mother;
		f = father;
		age = aje;
		impath = imm;		
	}
	
	public Ponii(String n, String d, String cm, String mother, String father, String mato, int aje, int chl, String imm) {
		state = 3;
		name = n;
		desc = d;
		cutii = cm;
		m = mother;
		f = father;
		mt = mato;
		age = aje;
		nc = chl;
		impath = imm;
	}
	
	public Ponii() {
		System.out.println("Aw Snap. This something ain't gonna work");
	}
	
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public String getCMDesc() {
		return cutii;
	}
	
	public String getMother() {
		return m;
	}
	
	public String getFather() {
		return f;
	}
	
	public String getSp() {
		return mt;
	}
	
	public int getAge() {
		return age;
	}
	
	public int getKidAmmount() {
		return nc;
	}
	
	public int getState(int i) {
		if (i == 474201){
			return state;
		} else {
			return 0;
		}
	}
	
	public String[] getKids() {
		return c;
	}
	
	public String getImagePath() {
		return impath;
	}
}
