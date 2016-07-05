package DevTSK.Toast;

import java.io.File;
import DevTSK.Util.unJSON;

public class Loader {

	private File f;

	private SaveFile svg;

	public Loader(File f) throws Exception {
		this.f = f;

		svg = (SaveFile) unJSON.deserializeJSONFile(SaveFile.class, f);
	}

}
