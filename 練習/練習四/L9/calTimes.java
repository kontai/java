package 練習.練習四.L9;

import java.util.Date;
public class calTimes {
    public static void main(String[] args) {
        int j=10000;
        Date d1=new Date();
        for(int i=0;i<8;i++)
        {
            d1.setTime(j);
            System.out.println(d1.toString());
            j*=10;
        }
    }

}
