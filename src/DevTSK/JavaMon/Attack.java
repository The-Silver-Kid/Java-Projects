package DevTSK.JavaMon;

public class Attack {

	public final Boolean neverMiss, OHKO;

	private Type type = new Type("Normal");

	private double baseDamage = 0, baseAccuracy = 0, priority = 1;

	private int category = 0;

	private Effect sideEffect = new Effect();

	private String name = "Null";

	public Attack(String name, Type type, int category, int pp, int power, double accuracy, Boolean neverMiss, Boolean OHKO, Effect sideEffect) {
		this.neverMiss = neverMiss;
		this.type = type;
		baseAccuracy = accuracy;
		baseDamage = power;
		this.sideEffect = sideEffect;
		this.name = name;
		this.category = category;
		this.OHKO = OHKO;
	}

	public Attack() {
		neverMiss = false;
		OHKO = false;
	}

	public String getName() {
		return name;
	}

	public Type getType() {
		return type;
	}

	public double[] getBase() {
		return new double[] { baseDamage, baseAccuracy, priority };
	}

	public Effect getEffect() {
		return sideEffect;
	}

	public int getPhysical() {
		return category;
	}
}
