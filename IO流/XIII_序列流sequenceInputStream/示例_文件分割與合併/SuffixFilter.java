package IO流.XIII_序列流sequenceInputStream.示例_文件分割與合併;

import java.io.File;
import java.io.FilenameFilter;

public class SuffixFilter implements FilenameFilter {

	private String suffix;
	
	public SuffixFilter(String suffix) {
		super();
		this.suffix = suffix;
	}

	@Override
	public boolean accept(File dir, String name) {

		return name.endsWith(suffix);
	}

}
