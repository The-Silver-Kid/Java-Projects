package DevTSK.Configurator;

import java.net.*;

/**
 * @author The_Silver_Kid
 */

public class Config {
	
	private static URI dir = null;
	
	public Config(int in) throws URISyntaxException, MalformedURLException {
		init(in, "");
	}
	
	public Config(String s) throws MalformedURLException, URISyntaxException {
		init(0, s);
	}
	
	private static void init(int i, String l) throws URISyntaxException, MalformedURLException{
		String s = "null";
		if (i == 1)
			s = "file://./poniiconfig.ini";
		
		if (i == 0)
			s = l;
		
		URL u = new URL(s);
		
		dir = u.toURI();
		
		System.out.println(dir);
	}

	public URI getDirectory() {
		return dir;
	}

}
