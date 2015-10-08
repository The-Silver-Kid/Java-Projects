package development;

import DevTSK.Entity.*;

public class TestingEnv {
	//Name, Gender, Description, ManeColour, TailColour, Mother, Father, int age, int month, int year, Imagename, CutiimarkImage
	public static void main(String[] args) throws Exception {
		EntityLoader h = new EntityLoader(new Entity[] {
				new UnMarriedPonii("OC 1", "OC one", "", false, "Desc", "CMDesc", "Mane", "Tail", "mom", "dad", 10, 10, 10, 10, "null.png", "null.png"),
				new UnMarriedPonii("OC 2", "OC two", "", false, "Desc", "CMDesc", "Mane", "Tail", "mom", "dad", 10, 10, 10, 10, "null.png", "null.png")
		}, new Entity[] {
				new UnMarriedPonii("NOC 1", "NOC one", "", false, "test", "test", "Mane", "Tail", "mom", "dad", 10, 10, 10, 10, "null.png", "null.png"),
				new UnMarriedPonii("NOC 2", "NOC two", "", false, "test", "test", "Mane", "Tail", "mom", "dad", 10, 10, 10, 10, "null.png", "null.png")
		});
		h.punch();
		h.setupConfig();
		h.punch();
	}

}
