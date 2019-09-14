package 抽象類.發紅包;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User {
    public Member() {
    }

    public Member(String name, int money) {
        super(name, money);
    }
    public void recent(ArrayList<Integer> list)
    {
        int num=new Random().nextInt(list.size());
        int MyMoney=list.remove(num);
        setMoney(MyMoney);
    }
}
