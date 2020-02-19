package 集合框架.III泛型.III_自定義泛型.I泛型類;
/*
public class Tool {

	private Object object;

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}

}
*/
//在jdk1.5后，使用泛型來接收類中要操作的引用數據類型。
//泛型類。什么時候用？當類中的操作的引用數據類型不確定的時候，就使用泛型來表示。


public class Tool<QQ> {
    private QQ q;

    public QQ getObject()
    {
        return q;
    }

    public void setObject(QQ object)
    {
        this.q = object;
    }


    /**
     * 将泛型定义在方法上。
     *
     * @param str
     */
    public <W> void show(W str)
    {
        System.out.println("show : " + str.toString());
    }

/*
    public void print(QQ str) {
        System.out.println("print : " + str);
    }
*/

    public void print(QQ str)
    {
        System.out.println("print : " + str);
    }

    /**
     * 當方法靜態時，不能訪問類上定義的泛型。
     * 如果靜態方法使用泛型,只能將泛型定義在方法上。
     *
     * @param obj
     */
    public static <Y> void method(Y obj)
//    public static  void method(QQ obj)
    {
        System.out.println("method:" + obj);
    }
}
