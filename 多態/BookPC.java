package 多態;

interface USB{
    void open();
    void close();
}

public class BookPC {
    public static void main(String[] args){
        useUSB(new UPan()); //功能擴展
        useUSB(new UsbMouse());
    }

    public static void useUSB(USB u){   //接口類型的引用，用於接收（指向）接口的子類對象。
        if(u!=null){
            u.open();
            u.close();
        }
    }

}

//實現規則

class UPan implements USB
{
    public void open(){System.out.println("UPan open!");}
    public void close(){System.out.println("Upan close...");}
}

class UsbMouse implements USB
{
    public void open(){System.out.println("UsbMouse open!");
    };
    public void close(){System.out.println("UsbMouse close...");
    };

}
