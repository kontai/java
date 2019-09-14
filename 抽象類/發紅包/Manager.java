package 抽象類.發紅包;

import java.util.ArrayList;

public class Manager extends User {
    public Manager() {
    }

    public Manager(String name, int money) {
        super(name, money);
    }

    public ArrayList<Integer> ToaalMoney(int money,int ppl)
    {
        int OringMoney=getMoney(); //先判斷錢夠不夠發
        if(OringMoney>=money)
            setMoney(OringMoney-money);
        else {
            System.out.println("金額不足!");
            return null;
        }

        ArrayList<Integer> list=new ArrayList<>();
        int dollars=money/3; //平均後取整
        int last=money%3;    //取餘數(給最後一位會員)

        for(int i=0;i<ppl-1;i++)
        {
            list.add(dollars);
        }
        list.add(dollars+last);  //最後一位有Bonus


        return list;
    }
}
