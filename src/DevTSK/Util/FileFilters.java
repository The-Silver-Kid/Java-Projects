package DevTSK.Util;

import java.io.File;
import java.io.FilenameFilter;
import javax.swing.filechooser.FileFilter;

public class FileFilters extends FileFilter implements FilenameFilter {

	private String fileExtension = ".txt", desc = "Generic Text Document";

	public FileFilters(String fileExtension, String desc) {
		this.fileExtension = fileExtension;
		this.desc = desc;
	}

	@Override
	public boolean accept(File directory, String fileName) {
		return (fileName.endsWith(this.fileExtension));
	}

	@Override
	public boolean accept(File arg0) {
		String fileName = arg0.getName();
		return (fileName.endsWith(this.fileExtension) || (arg0.isDirectory()));
	}

	@Override
	public String getDescription() {
		return desc;
	}
}
