package 繼承;//package 繼承;

class Fu{
    Fu()
    {
        super();
        System.out.println(this);

        show();
        return;
    }
    
    void show()
    {
        System.out.println("fu show");
        
    }
}

class Zi extends Fu{
    int num=8;
    Zi(){
        super();
        //通過super初始化負累內容時,子類變量並未顯示初始化。等super()父類初始化完畢後
        //才會進行子類的成員變量初始化
        System.out.println(this);
        show();
        return;
    }

    void show(){
        System.out.println("zi show..."+num);
        
    }
        
}



public class ExtendsDemo {
    public static void main(String[] args){
        Zi aa=new Zi();
        System.out.println("-----");
        
        Fu bb=new Fu();
    }
    
    
    
}
