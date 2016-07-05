package DevTSK.Util;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class StringWriter {

	public StringWriter() {
	}

	public void Write(String toWrite, String Filename, Boolean overwrite) throws IOException {
		File f = new File("./" + Filename);
		if ((!f.exists() && !f.isDirectory()) || overwrite) {
			FileOutputStream out = new FileOutputStream(f);
			out.write(toWrite.getBytes());
			out.close();
		}
	}

	public void Write(String toWrite, String Filename, Boolean overwrite, String destination) throws IOException {
		File f = new File(destination + "/" + Filename);
		if ((!f.exists() && !f.isDirectory()) || overwrite) {
			FileOutputStream out = new FileOutputStream(f);
			out.write(toWrite.getBytes());
			out.close();
		}
	}
}
