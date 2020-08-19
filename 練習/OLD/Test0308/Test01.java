package Test0308;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * The type Test 01.
 *
 * @Descripton 模擬BufferedRead
 */
public class Test01 {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     * @throws IOException the io exception
     */
    public static void main(String[] args) throws IOException
    {
        ReadModeWithBufferRead rd=new ReadModeWithBufferRead(new FileReader("buf.txt"));
        FileWriter write=new FileWriter("copy.txt");
        int i=0;
        while((i=rd.MyRead())!=-1)
            write.write(i);
        rd.Myclose();
        write.close();
    }
}

/**
 * The type Read mode with buffer read.
 */
class ReadModeWithBufferRead {
    //Buffer size
    /**
     *
     */
    private final int BUFFSIZE = 1024;
    //File stream
    private FileReader fr;
    private int count;
    private int pos=0;
    private char[] buff = new char[BUFFSIZE];

    /**
     * Instantiates a new Read mode with buffer read.
     *
     * @param fr the fr
     */
    public ReadModeWithBufferRead(FileReader fr)
    {
        this.fr = fr;
    }

    /**
     * My read int.
     *
     * @return the int
     * @throws IOException the io exception
     */
    public int MyRead() throws IOException
    {

        if (count == 0)
        {
            count = fr.read(buff);
            System.out.println(count+"...."+new String(buff,0,5));
            pos=0;
        }
        else if (count < 0)
        {
            return -1;
        }
        char ch = buff[pos++];
        count--;

        return ch;
    }

    /**
     * Myclose.
     *
     * @throws IOException the io exception
     */
    public void Myclose() throws IOException
    {
        fr.close();
    }
}
