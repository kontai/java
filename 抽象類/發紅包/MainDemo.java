package 抽象類.發紅包;

import java.util.ArrayList;

public class MainDemo {
    public static void main(String[] args) {
        Manager Me=new Manager("kontai",2000);
        Member one=new Member("土匪",0);
        Member two=new Member("強盜",0);
        Member three =new Member("海賊",0);

        one.show();
        two.show();
        three.show();

        ArrayList<Integer> RedPacket;  //發錢
        RedPacket=Me.ToaalMoney(2000,3);
        one.recent(RedPacket);
        two.recent(RedPacket);
        three.recent(RedPacket);

        one.show();
        two.show();
        three.show();
        System.out.printf("%s的餘額=%d",Me.getName(),Me.getMoney());

    }
}
