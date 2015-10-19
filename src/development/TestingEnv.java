package development;

import DevTSK.Entity.Entity;
import DevTSK.Entity.EntityLoader;
import DevTSK.Entity.UnMarriedPonii;

public class TestingEnv {
	//Name, AltName, Flag, Gender, Description, ManeColour, TailColour, Mother, Father, Integer age, Integer day, Integer month, Integer year, ImageName, CutiimarkImage
	public static void main(String[] args) throws Exception {
		EntityLoader h = new EntityLoader(new Entity[] {
				new UnMarriedPonii("OC 1", "OC one", "", false, false, "Desc", "CMDesc", "Mane", "Tail", "mom", "dad", 10, 10, 10, 10, "null.png", "null.png"),
				new UnMarriedPonii("OC 2", "OC two", "", false, true, "Desc", "CMDesc", "Mane", "Tail", "mom", "dad", 10, 10, 10, 10, "null.png", "null.png")
		}, new Entity[] {
				new UnMarriedPonii("NOC 1", "NOC one", "", false, false, "test", "test", "Mane", "Tail", "mom", "dad", 10, 10, 10, 10, "null.png", "null.png"),
				new UnMarriedPonii("NOC 2", "NOC two", "", false, true, "test", "test", "Mane", "Tail", "mom", "dad", 10, 10, 10, 10, "null.png", "null.png")
		});
		h.punch();
		h.setupConfig();
		h.punch();
	}

}
