package Class.Sandwitch;

public class Sandwitch {

	public final static Table t = new Table("The one in frount of you");

	public static Knife k = new Knife("The one on " + t.toString());
	public static PButter pb = new PButter("Also on " + t.toString());
	public static Jelly j = new Jelly("Also on " + t.toString());
	public static BreadBag bb = new BreadBag("Also on " + t.toString());

	public static void main(String[] args) {
		bb.open();
		breadSlice[] breadSlices = bb.remove(2);
		breadSlices[0].moveFrom(breadSlices[1]);

		pb.open();
		pb.remove(k.insertIntoPButterJar(.25, pb));

		k = breadSlices[0].spreadPB(k);

	}
}

class PButter {
	Boolean isOpen = false;
	private double amount = 100;

	public PButter(String s) {

	}

	public void remove(double remAmmount) {
		amount = amount - remAmmount;
	}

	public void open() {
		isOpen = true;
	}
}

class Jelly {
	Boolean isOpen = false;
	private double amount = 100;

	public Jelly(String s) {

	}

	public void remove(double remAmmount) {
		amount = amount - remAmmount;
	}

	public void open() {
		isOpen = true;
	}
}

class BreadBag {
	public Boolean isOpen = false;
	public int amount = 36;

	public BreadBag(String s) {

	}

	public breadSlice[] remove(int i) {
		amount = amount - 2;
		return new breadSlice[2];
	}

	public void open() {
		isOpen = true;
	}
}

class Knife {
	double penutButterAmmount = 0;

	public Knife(String s) {
	}

	public double insertIntoPButterJar(double d, PButter ppbb) {
		penutButterAmmount = d * 4;
		return d * 4;
	}
}

class breadSlice {
	double penutButterAmmount = 0;

	public breadSlice() {
	}

	public void moveFrom(breadSlice breadSlice) {

	}

	public static void seperate() {

	}

	public Knife spreadPB(Knife f) {
		penutButterAmmount = f.penutButterAmmount;
		f.penutButterAmmount = 0;
		return f;
	}
}

class Table {
	String s = "";

	public Table(String s) {
		this.s = s;
	}

	public String toString() {
		return s;
	}

}
