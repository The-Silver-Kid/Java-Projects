package development;

import java.io.BufferedReader;
// import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import DevTSK.Entity.Entity;
import DevTSK.Entity.UnMarriedPlane;
import DevTSK.Util.Day;

public class TestingEnv {

	public static void main(String[] args) throws IOException {
		Entity e = new UnMarriedPlane("Full Name", "Short name", "flag", false, true, "Desc", "CM info", "mane colour", "tail colour", "mum", "dad", new Day(), "Image name", "cm image name");
		FileOutputStream p = new FileOutputStream("out.json");
		//FileInputStream r = new FileInputStream("out.txt");
		Gson g = new GsonBuilder().create();
		char[] c = g.toJson(e).toCharArray();
		byte[] b = new byte[c.length];
		for (int i = 0; i < c.length; i++)
			b[i] = (byte) c[i];
		p.write(b);
		p.close();
		BufferedReader br = new BufferedReader(
				new FileReader("out.json"));
		Entity ee = g.fromJson(br, UnMarriedPlane.class);

		System.out.println(ee.toString());
	}
}
