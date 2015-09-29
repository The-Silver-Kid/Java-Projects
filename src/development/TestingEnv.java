package development;

import development.Char.Entity;
import development.Char.EntityHandler;
import development.Char.UnMarriedPonii;

public class TestingEnv {
	//Name, Gender, Description, ManeColour, TailColour, Mother, Father, int age, int month, int year, Imagename, CutiimarkImage
	public static void main(String[] args) throws Exception {
		EntityHandler h = new EntityHandler(
				new Entity[] {
						new UnMarriedPonii("Test", false, "lol", "Black", "Black", "Mother", "Father", 0, 0, 0, null, null),
						new Entity()
				}, 
				new Entity[] {
						new UnMarriedPonii("Fuck you", true, null, null, null, null, null, 0, 0, 0, null, null)
				});
		System.out.println(h.getOriginalString());
		System.out.println(h.getNonOriginalString());
		System.out.println(h.getEntityByNumber(true, 1).getGender());
		System.out.println(h.getEntityByNumber(false, 0).getGender());
		System.out.println(h.getEntityByName(true, "test").getGender());
		System.out.println(h.getEntityByName(false, "Fuck you").getGender());
	}

}
