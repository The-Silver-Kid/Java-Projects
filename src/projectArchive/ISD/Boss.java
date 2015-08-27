package projectArchive.ISD;

public class Boss {
	private String im;
	private int h, a, d;
	private String n;
	private String musik = "/Images/null.ogg";
	
	public Boss(String tn, String tim, int th, int ta, int td, String m) {
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
	
	public String getMusic(){
		return musik;
	}
}