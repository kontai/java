//package 練習.練習四.練習四_2;
//
////寫出程序結果
//
//public class Demo2
//{
//    public static String output = "";
//
//    public static void foo(int i)
//    {
//        try
//        {
//            if (i == 1)
//            {
//                throw new Exception();
//            }
//            output += "1";
//        }
//        catch (Exception e)
//        {
//            output += "2";
//            return;
//        }
//            finally
//        {
//            output += "3";
//        }
//        output += "4";
//
//    }
//
//    public static void main(String[] args)
//    {
//        foo(0);
//        System.out.println(output);
//        foo(1);
//        System.out.println(output);
//    }
//}
