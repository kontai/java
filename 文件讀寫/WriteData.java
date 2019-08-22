package 文件讀寫;

import java.io.FileNotFoundException;

public class WriteData {
    public static void main(String[] args)throws Exception {
        java.io.File file=new java.io.File("test.txt");
        if (file.exists()) {
            System.out.printf("%s already exists!",file.getName());
            file.delete();
            System.exit(1);
        }

 /*       method I
        java.io.PrintWriter output=new java.io.PrintWriter(file);

        output.print("John T Smith ");
        output.println(90);
        output.print("Eric K Jones ");
        output.println(85);

//必須使用close()方法關閉文件。如果沒有調用close(),數據無法正確保存再文件中
        output.close();
  */

 //     moehod II  使用try-with-resources語法，塊結束後，close()自動調用以關閉資源
//      資源放在括號中,資源必須是AutoCloseable的子類型 ex:PrintWriter,具有close()方法>

        try(java.io.PrintWriter output=new java.io.PrintWriter(file))
        {
            output.print("John T Smith ");
            output.println(90);
            output.print("Eric K Jones ");
            output.println(85);
        }
//        catch (FileNotFoundException ex) {
//            ex.printStackTrace();
//        }


    }
}
