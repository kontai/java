package IO流.XX_commons_API使用;

import java.io.File;

import org.apache.commons.io.FileUtils;

/**
 * 大小
 * @author 裴新
 *
 */
public class CIOTest01 {

	public static void main(String[] args) {
		//文件大小
		long len =FileUtils.sizeOf(new File("IO流/XX_commons_API使用/CIOTest01.java"));
		System.out.println(len);
		//目录大小
		len = FileUtils.sizeOf(new File("D:/workspace/JAVA"));
		System.out.println(len);
	}

}
