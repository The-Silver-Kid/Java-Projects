package DevTSK.Char;

public class Ponii {
	private int age = 0, nc = 0, state = 0;
	private String name = "", desc = "", cutii = "", m = "", f = "", mt = "", DNA = "Oops";
	private String[] c = null;
	private String impath = "/images/null.png", musik = "null.ogg";
	
	public Ponii(String n, String d, String cm, String mother, String father, String mato, int aje, int chl, String[] childnames, String imm, String code) {
		//Married with kids
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
		DNA = code;
	}
	
	public Ponii(String n, String d, String cm, String mother, String father, int aje, String imm, String code) {
		//Single
		state = 2;
		name = n;
		desc = d;
		cutii = cm;
		m = mother;
		f = father;
		age = aje;
		impath = imm;
		DNA = code;
	}
	
	public Ponii(String n, String d, String cm, String mother, String father, String mato, int aje, String imm, String code) {
		//Married no kids
		state = 3;
		name = n;
		desc = d;
		cutii = cm;
		m = mother;
		f = father;
		mt = mato;
		age = aje;
		nc = 0;
		impath = imm;
		DNA = code;
	}
	
	public Ponii(String n, String d, String cm, String mother, String father, String mato, int aje, int chl, String[] childnames, String imm, String mp, String code) {
		state = 4;
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
		musik = mp;
		DNA = code;
	}
	
	public Ponii(String n, String d, String cm, String mother, String father, int aje, String imm, String mp, String code) {
		state = 5;
		name = n;
		desc = d;
		cutii = cm;
		m = mother;
		f = father;
		age = aje;
		impath = imm;	
		musik = mp;
		DNA = code;
	}
	
	public Ponii(String n, String d, String cm, String mother, String father, String mato, int aje, String imm, String mp, String code) {
		state = 6;
		name = n;
		desc = d;
		cutii = cm;
		m = mother;
		f = father;
		mt = mato;
		age = aje;
		nc = 0;
		impath = imm;
		musik = mp;
		DNA = code;
	}
	
	public Ponii() {
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
			return -1;
		}
	}
	
	public String[] getKids() {
		return c;
	}
	
	public String getImagePath() {
		return impath;
	}
	
	public String getMusicPath() {
		return musik;
	}
	
	public String getDNA() {
		return DNA;
	}
}
