package IO流.X_IO_FILE類與常見功能.II_獲取.過濾器;

import java.io.File;
import java.io.FilenameFilter;

public class SuffixFilter implements FilenameFilter {

	private String suffix ;
	public SuffixFilter(String suffix) {
		super();
		this.suffix = suffix;
	}
	@Override
	public boolean accept(File dir, String name) {

		return name.endsWith(suffix);
	}

}
