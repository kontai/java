package 異常;


class IndexNegException extends Exception
{
    IndexNegException(){}
    IndexNegException(String msg)
    {
        super(msg);
    }
}

class Demo
{
    public int method(int[] arr,int index)throws IndexNegException//,IndexOutOfBoundsException (RuntimeException異常,可不用聲明拋出）
    {
        if(index<0)
        {
            throw new IndexNegException("角標負數異常！");
        }
        if(arr.length==0)
        {
            throw new IndexOutOfBoundsException();
        }

        return 0;
    }
}

public class arrayDemo
{
    public static void main(String[] args){
        int[] arr={0};
        Demo a=new Demo();

        try
        {
            a.method(arr,-1);
        }
        catch (IndexNegException err)
        {
            System.out.println("抓到啦！！\n");
            System.out.println("message:"+err.getMessage());   //異常對象中的訊息
            System.out.println("string:"+err.toString());      //所屬異常類
            err.printStackTrace();  //jvm默認的異常處理機制就是調用異常對象的這個方法。
            //return;        //主函數結束後,finally還是會執行。
            System.exit(0); //直接退出jvm，finally就不會執行。
        }
        catch (IndexOutOfBoundsException eo)
        {
            System.out.println("越界！");
        }
        catch (Exception eg)
        {
            System.out.println("老大留在最後面。。。");
            
        }
        finally     //通常用於關閉（釋放）資源。『當發生異常，也能夠執行最後的動作。』
        {
            System.out.println("finally");

        }
        System.out.println("over");
        

    }


}
