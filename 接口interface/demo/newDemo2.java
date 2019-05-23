package 接口interface.demo;

/*
JAVA不支持多繼承,因多繼承會有許多不確定性
但可利用接口實現多繼承,主要因為接口內的方法皆為抽象(無函數主體)
 */
//接口可以多實現

interface IA{
    public abstract void show();
}

interface IB{
    public abstract void show();
    public abstract int add(int a,int b);
}

class dd implements IA,IB
{
    public void show(){};
    public int add(int a,int b){return a+b;}
}

//接口可以多繼承
interface IC extends IA,IB{
    public abstract void another_show();
}

class ee implements IC{
    public void show(){};
    public int add(int a,int b){return a+b;}
    public void another_show() {};
}
class newDemo2{
    public static void main(String[] args){
        dd d1=new dd();
        ee e1=new ee();
    }


}