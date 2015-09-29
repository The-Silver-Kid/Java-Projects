package development;

import development.Char.Entity;
import development.Char.Ponii;

public class TestingEnv {

	public static void main(String[] args) throws Exception {
		Entity e = new Entity();
		System.err.println(e.getGender());
		Ponii p = new Ponii();
		System.err.println(p.getGender());
	}

}
