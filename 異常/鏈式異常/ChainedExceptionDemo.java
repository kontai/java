package 異常.鏈式異常;
/*
要点提示 : 和其他异常一起抛出一个异常 ,构成了链式异常 。
        catch 块重新抛出原始的异常 。 有时候 , 可能需要同原始异常一起抛出一
        新异常 (带有附加信息 。) , 这称为链式异常( chained exception )
 */


public class ChainedExceptionDemo {
    public static void main(String[] args) {
        try
        {
            method1();
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        finally {
        }
    }

  protected   static void method1() throws Exception
  {
      try
      {
          method2();
      }
      catch(Exception ex2)
      {
          //捕獲method2拋出的異常,並包裝成一個新的異常。
          throw new Exception("New info from method1",ex2);
//          throw new Exception("New info from method1");
      }
  }

  protected static void method2() throws Exception
  {
      throw new Exception("New info from method2");
  }
}
