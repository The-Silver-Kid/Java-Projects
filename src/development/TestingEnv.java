package development;

import org.ini4j.*;
import org.ini4j.Profile.Section;

public class TestingEnv {

	public static void main(String[] args) throws Exception {
		Ini ini = new Ini();
		Section value = new Selection();
		ini.add("Hi", value);
		
	}

}
