package IO流.XX_commons_API使用;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * 写出内容
 * @author 裴新
 *
 */
public class CIOTest04 {
	public static final String NL=System.lineSeparator();

	public static void main(String[] args) throws IOException {
		//写出文件
		FileUtils.write(new File("IO流\\XX_commons_API使用\\happy.txt"), "学习是一件伟大的事业\r\n","UTF-8");
		FileUtils.writeStringToFile(new File("IO流\\XX_commons_API使用\\happy.txt"), "学习是一件辛苦的事业\r\n","UTF-8",true);
		FileUtils.writeByteArrayToFile(new File("IO流\\XX_commons_API使用\\happy.txt"), "学习是一件幸福的事业\r\n".getBytes("UTF-8"),true);
		//写出列表
		List<String> datas =new ArrayList<String>();
		datas.add("马云");
		datas.add("马化腾");
		datas.add("弼马温");
//		System.out.println(Arrays.toString(NL.getBytes()));
		
		FileUtils.writeLines(new File("IO流\\XX_commons_API使用\\happy.txt"), datas,"。。。。。",true);
	}

}
