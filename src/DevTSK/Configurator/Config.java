package DevTSK.Configurator;

import java.net.*;

/**
 * @author The_Silver_Kid
 */

public class Config {
	
	private static URI dir = null;
	
	public Config(int in) throws URISyntaxException, MalformedURLException {
		init(in);
	}
	
	private static void init(int i) throws URISyntaxException, MalformedURLException{
		String s = "null";
		if (i == 1)
			s = "file://./poniiconfig.ini";
		
		URL u = new URL(s);
		
		dir = u.toURI();
	}

	public URI getDirectory() {
		return dir;
	}

}
