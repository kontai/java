package IO流.X_IO_FILE類與常見功能;

import java.io.File;
import java.io.IOException;

public class TestFileClass {
    public static void main(String[] args) throws IOException {
//        File file=new File("/home/kontai/圖片/us.gif");
        StringBuilder path=new StringBuilder("1");
        File file=new File(path.toString());
        file.createNewFile();

        System.out.println("Dose it exist? "+file.exists());
        System.out.println("The file has "+file.length()+" bytes");
        System.out.println("Can it be read? "+file.canRead());
        System.out.println("Can it be write? "+file.canWrite());
        System.out.println("Is it a directory? "+file.isDirectory());
        System.out.println("Is it a file? "+file.isFile());
        System.out.println("Is it a absolute? "+file.isAbsolute());
        System.out.println("Is it a hidden? "+file.isHidden());
        System.out.println("Absoulte path is "+file.getAbsolutePath());
//        System.out.println("Canonical path is "+file.getCanonicalPath());
        System.out.println("Last modifies on "+new java.util.Date(file.lastModified()));
//        file.renameTo(new File("test.gif"));

    }
}
