package DevTSK.Detector;

import java.io.File;

public class FileDetect {
	
	private static String input;
	
	public FileDetect(String in) {
		input = in;
	}
	
	public Boolean Detect() {
		Boolean exist = false;
		File f = new File(input);
		if (f.exists() && !f.isDirectory())
			exist = !exist;
		
		return exist;
	}
}
