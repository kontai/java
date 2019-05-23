import java.io.*;

class encoding {
    public static void main(String[] args)throws Exception {
        File infile = new File("d:\\encoded.jpg");
        File outfile = new File("d:\\decoded.jpg");
        FileInputStream in = new FileInputStream(infile);
        FileOutputStream out = new FileOutputStream(outfile);
        int content = 0;
        while ((content = in.read()) != -1) {
            out.write(content ^ 22);
        }
        out.close();
        in.close();
    }
}
