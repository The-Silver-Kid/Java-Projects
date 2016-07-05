package DevTSK.Util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import com.google.gson.Gson;

public class unJSON {

	public unJSON() {
	}

	public static Object deserializeJSONFile(Object o, File f) throws Exception {
		Object ret = new Object();
		if (f.exists()) {
			Gson g = new Gson();

			BufferedReader br = new BufferedReader(new FileReader(f));
			ret = g.fromJson(br, o.getClass());
		}
		return ret;
	}
}
