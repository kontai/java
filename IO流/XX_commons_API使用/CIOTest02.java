//package IO流.XX_commons_API使用;

import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FileFilterUtils;
import org.apache.commons.io.filefilter.SuffixFileFilter;

import java.io.File;
import java.util.Collection;

//import org.apache.commons.io.FileUtils;

/**
 * 列出子孙级
 * @author 裴新
 *
 */
public class CIOTest02 {

	public static void main(String[] args) {
		Collection<File> files =FileUtils.listFiles(new File("IO流\\XX_commons_API使用"),
				EmptyFileFilter.NOT_EMPTY, null);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("---------------------");
		 files =FileUtils.listFiles(new File("IO流\\XX_commons_API使用"),
					EmptyFileFilter.NOT_EMPTY, DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("---------------------");
		 files =FileUtils.listFiles(new File("IO流\\XX_commons_API使用"),
					new SuffixFileFilter("java"), DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		System.out.println("---------------------");
		 files =FileUtils.listFiles(new File("IO流\\XX_commons_API使用"),
					FileFilterUtils.or(new SuffixFileFilter("java"),
							new SuffixFileFilter("class"),EmptyFileFilter.EMPTY), DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
		
		System.out.println("---------------------");
		 files =FileUtils.listFiles(new File("IO流\\XX_commons_API使用"),
					FileFilterUtils.and(new SuffixFileFilter("java"),
							EmptyFileFilter.NOT_EMPTY), DirectoryFileFilter.INSTANCE);
		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}
	}

}
