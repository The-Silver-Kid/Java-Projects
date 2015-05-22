package Group.ISD;

public class Badii {
	private String im;
	private int h, a, d;
	private String n;
	
	public Badii(String tn, String tim, int th, int ta, int td) {
		im = tim;
		h = th;
		a = ta;
		d = td;
		n = tn;
	}
	
	public String getname() {
		return n;
	}
	
	public String getimagePath() {
		return im;
	}
	
	public int attack() {
		return a;
	}
	
	public int def() {
		return d;
	}
	
	public int he() {
		return h;
	}
	
	public void sethe(int thp) {
		h = thp;
	}
}