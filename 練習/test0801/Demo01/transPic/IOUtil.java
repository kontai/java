package transPic;

import java.io.*;

public class IOUtil {
    public static byte[] fileToBytes(String src) throws IOException
    {
        File file = null;
        InputStream ins = null;
        byte[] buff = null;
        try
        {
            file = new File(src);
            ins = new FileInputStream(file);

            //create buffer
            buff = ins.readAllBytes();

        } catch (FileNotFoundException e)
        {
            e.printStackTrace();
        } catch (IOException e)
        {
            e.printStackTrace();
        } finally
        {
            if (ins != null)
            {
                ins.close();
            }
            if (buff == null)
            {
                System.out.println("data read fail!");
                return null;
            }
            return buff;
        }

    }
}
