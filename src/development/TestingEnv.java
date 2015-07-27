package development;

import DevTSK.Configurator.Config;

public class TestingEnv {

	public static void main(String[] args) throws Exception {
		Config c = new Config(1);
		
		System.err.println(c.getDirectory());
	}

}
