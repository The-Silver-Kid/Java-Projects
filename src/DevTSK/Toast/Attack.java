package DevTSK.Toast;

public class Attack {

	Boolean neverMiss = false;
	
	Type type = new Type("Normal");
	
	int baseDamage = 0, baseAccuracy = 0;
	
	Effect sideEffect = new Effect();
	
	public Attack(Boolean neverMiss, Type type, int accuracy, int power, Effect sideEffect){
		this.neverMiss = neverMiss;
		this.type = type;
		baseAccuracy = accuracy;
		baseDamage = power;
		this.sideEffect = sideEffect;
	}
}
