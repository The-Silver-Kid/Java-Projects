/**
 * @author The_Silver_Kid
 * @Version 2.0
 *
 *          <b>Uses 3rd Party API for the configuration file.</b>
 *
 */
package Class.Entity;

import java.io.IOException;

import DAG.Config.ConfigException;

/**
 * The Class that sets up the window and loads the entity information list
 */
public class MasterControl {

	private static EntityLoader h;
	private static String charsetname = "null";

	public static void main(String[] args) throws ConfigException, IOException {
		if (args.length != 0)
			for (int i = 0; i < args.length; i++)
				System.out.println(args[i]);
		if (h != null) {
			EntityLoader.poni.frmPoniiPic.dispose();
			EntityLoader.poni.frmPoniiPicCont.dispose();
		}
		if (args.length < 1 || args[0].equals("Default")) {
			charsetname = "Default";
			h = new EntityLoader(new Entity[] {

			}, new Entity[] {

			});
		}
		if (args.length >= 1) {
			if (args[0].equals("CharsetTwo")) {
				charsetname = "CharsetTwo";
				h = new EntityLoader(new Entity[] {
				}, new Entity[] {
				});
			}
			if (args[0].equals("CharsetThree")) {
				charsetname = "CharsetThree";
				h = new EntityLoader(new Entity[] {
				}, new Entity[] {
				});
			}
		}
		h.punch();
		h.setupConfig(charsetname);
		h.punch();
	}
}
