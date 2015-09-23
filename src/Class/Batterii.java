package Class;

public class Batterii {
	
	private double power = 0, charge = 0;
	
	public Batterii() {
	}
	
	public Batterii(double pwr){
		if (pwr > 100)
			pwr = 100;
		pwr = pwr * .01;
		charge = pwr;
		power = 3000 * pwr;
	}
	
	public void charge(){
		charge = charge + .01;
		power = 3000 * charge;
	}
	
	public double getPower(){
		charge = charge - .01;
		power = 3000 * charge;
		return power;
	}
}
