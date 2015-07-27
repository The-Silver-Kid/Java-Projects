package development;

import DevTSK.Configurator.Config;
import DevTSK.Configurator.ConfigHandler;

public class TestingEnv {

	public static void main(String[] args) throws Exception {
		Config c = new Config(1);
		
		ConfigHandler ch = new ConfigHandler("file://laul");
	}

}
