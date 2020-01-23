package 五finally的使用;

class Demo {
    public int show(int index) throws ArrayIndexOutOfBoundsException
    {

		if (index < 0)
		{
			throw new ArrayIndexOutOfBoundsException("越界啦！！");
		}
        int[] arr = new int[3];
        return arr[index];
    }
}


class ExceptionDemo5 {
    public static void main(String[] args)
    {
        Demo d = new Demo();
        try
        {

            int num = d.show(-1);
            System.out.println("num=" + num);
        } catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e.toString());

//			return ;
//			System.exit(0);//退出jvm。
        } finally//通常用於關閉(釋放)資源。
        {
            System.out.println("finally");
        }

        System.out.println("over");

    }
}
/*

連接數據庫
查詢。Exception
關閉連接。

*/


/*
try catch finally 代碼塊組合特點：

1，
try catch finally

2,
try catch(多個)當沒有必要資源需要釋放時，可以不用定義finally。

3,
try finally 異常無法直接catch處理，但是資源需要關閉。 


void show()throws Exception
{
	try
	{
		//開啟資源。
		throw new Exception();
	}
	finally
	{
		//關閉資源。
		
	}


	/*
	catch(Exception e)
	{
		
	}
}
	*/
	


