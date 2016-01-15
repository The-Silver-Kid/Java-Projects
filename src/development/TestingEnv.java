package development;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestingEnv {

	public static void main(String args[]) throws IOException {

		File f = new File("Input.txt");
		if (!f.exists()) {
			System.err.println("The file '" + args[0] + "' was not found!");
			System.exit(1);
		}

		f.delete();
		byte[] out = new byte[] { 'H', 'E', 'L', 'L', 'O', ' ', 'W', 'O', 'R', 'L', 'D', '!' };
		FileOutputStream fout = new FileOutputStream(f);
		fout.write(out);
		fout.close();

		FileInputStream fin = new FileInputStream(f);
		byte[] in = new byte[fin.available()];
		fin.read(in);
		fin.close();

		for (int i = 0; i < in.length; i++)
			System.out.print((char) in[i]);
	}

}
