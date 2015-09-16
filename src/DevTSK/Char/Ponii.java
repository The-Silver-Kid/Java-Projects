package DevTSK.Char;

public class Ponii {
	private int age = 0, nc = 0, state = 0, dai = 0, month = 0, year = 0;
	private String name = "", desc = "", cutii = "", m = "", f = "", mt = "", DNA = "Oops", flag = "/u0020";
	private String[] c = null, w = null;
	private String impath = "null.png", musik = "null.ogg", cmpath = "null.png";
	
	public Ponii(String n, String flg, String d, String cm, String mother, String father, String mato, int aje, int chl, String[] childnames, String imm, String tcm, String code, int dy, int mn, int y) {
		System.out.println("Married with kids");
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
		cmpath = tcm;
		dai = dy;
		month = mn;
		year = y;
		flag = flg;
	}
	
	public Ponii(String n, String flg, String d, String cm, String mother, String father, int aje, String imm, String tcm, String code, int dy, int mn, int y) {
		System.out.println("single");
		state = 2;
		name = n;
		desc = d;
		cutii = cm;
		m = mother;
		f = father;
		age = aje;
		impath = imm;
		DNA = code;
		cmpath = tcm;
		dai = dy;
		month = mn;
		year = y;
		flag = flg;
	}
	
	public Ponii(String n, String flg, String d, String cm, String mother, String father, String mato, int aje, String imm, String tcm, String code, int dy, int mn, int y) {
		System.out.println("no kids");
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
		cmpath = tcm;
		dai = dy;
		month = mn;
		year = y;
		flag = flg;
	}
	
	public Ponii(String n, String flg, String d, String cm, String mother, String father, String mato, int aje, int chl, String[] childnames, String imm, String tcm, String mp, String code, int dy, int mn, int y) {
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
		cmpath = tcm;
		dai = dy;
		month = mn;
		year = y;
		flag = flg;
	}
	
	public Ponii(String n, String flg, String d, String cm, String mother, String father, int aje, String imm, String tcm, String mp, String code, int dy, int mn, int y) {
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
		cmpath = tcm;
		dai = dy;
		month = mn;
		year = y;
		flag = flg;
	}
	
	public Ponii(String n, String flg, String d, String cm, String mother, String father, String mato, int aje, String imm, String tcm, String mp, String code, int dy, int mn, int y) {
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
		cmpath = tcm;
		dai = dy;
		month = mn;
		year = y;
		flag = flg;
	}
	
	public Ponii(String n, String flg, String d, String cm, String mother, String father, int aje, int chl, String[] childnames, String[] kidswith, String imm, String tcm, String code, int dy, int mn, int y) {
		System.out.println("Not married with kids");
		if (kidswith.length == childnames.length) {
			state = 7;
			w = kidswith;
			name = n;
			desc = d;
			cutii = cm;
			m = mother;
			f = father;
			age = aje;
			nc = chl;
			c = childnames;
			impath = imm;
			DNA = code;
			cmpath = tcm;
			dai = dy;
			month = mn;
			year = y;
			flag = flg;
		}
	}
	
	public Ponii(String n, String flg, String d, String cm, String mother, String father, int aje, int chl, String[] childnames, String[] kidswith, String imm, String tcm, String mp, String code, int dy, int mn, int y) {
		if (kidswith.length == childnames.length) {
			state = 8;
			w = kidswith;
			name = n;
			desc = d;
			cutii = cm;
			m = mother;
			f = father;
			age = aje;
			nc = chl;
			c = childnames;
			impath = imm;
			musik = mp;
			DNA = code;
			cmpath = tcm;
			dai = dy;
			month = mn;
			year = y;
			flag = flg;
		}
	}
	
	public Ponii(String n, String flg, String d, String cm, String mother, String father, String mtt, int aje, int chl, String[] childnames, String[] kidswith, String imm, String tcm, String code, int dy, int mn, int y) {
		System.out.println("Married with kids Outside");
		if (kidswith.length == childnames.length) {
			state = 9;
			w = kidswith;
			name = n;
			desc = d;
			mt = mtt;
			cutii = cm;
			m = mother;
			f = father;
			age = aje;
			nc = chl;
			c = childnames;
			impath = imm;
			DNA = code;
			cmpath = tcm;
			dai = dy;
			month = mn;
			year = y;
			flag = flg;
		}
	}
	
	public Ponii(String n, String flg, String d, String cm, String mother, String father, String mtt, int aje, int chl, String[] childnames, String[] kidswith, String imm, String tcm, String mp, String code, int dy, int mn, int y) {
		if (kidswith.length == childnames.length) {
			state = 10;
			w = kidswith;
			name = n;
			mt = mtt;
			desc = d;
			cutii = cm;
			m = mother;
			f = father;
			age = aje;
			nc = chl;
			c = childnames;
			impath = imm;
			musik = mp;
			DNA = code;
			cmpath = tcm;
			dai = dy;
			month = mn;
			year = y;
			flag = flg;
		}
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
	
	public String[] getKidswith() {
		return w;
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
	public String getCMPath() {
		return cmpath;
	}
	
	public int getYear() {
		return year;
	}
	
	public int getDay() {
		return dai;
	}
	
	public String getFlag() {
		return flag;
	}
	
	public String getMonth() {
		String mnth = "";
		switch (month){
			default:
				mnth = "null";
				break;
			case 1:
				mnth = "January";
				break;
			case 2:
				mnth = "Febuary";
				break;
			case 3:
				mnth = "March";
				break;
			case 4:
				mnth = "April";
				break;
			case 5:
				mnth = "May";
				break;
			case 6:
				mnth = "June";
				break;
			case 7:
				mnth = "July";
				break;
			case 8:
				mnth = "August";
				break;
			case 9:
				mnth = "September";
				break;
			case 10:
				mnth = "October";
				break;
			case 11:
				mnth = "November";
				break;
			case 12:
				mnth = "December";
				break;
		}
		return mnth;
	}
}
