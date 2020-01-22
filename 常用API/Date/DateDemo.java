package 常用API.Date;

import java.util.Date;

/*
 * Date: 表示特定的瞬間，精確到毫秒，他可以通過方法來設定自己所表示的時間，可以表示任意的時間
 * System.currentTimeMillis():返回的是當前系統時間，1970-1-1至今的毫秒數
 *
 * 構造方法：
 * 		Date() ：創建的是一個表示當前系統時間的Date對像
		Date(long date) ：根據"指定時間"創建Date對像

 */
public class DateDemo {
    public static void main(String[] args) {
        //Date()
        //Date d = new Date();
        //System.out.println(d);//Thu Aug 26 14:17:28 CST 2049
        //System.out.println(d.toLocaleString());

        //Date(long date)
        Date d2 = new Date(1000 * 60 * 60 * 24);//時區 有時差
        System.out.println(d2.toLocaleString());

    }
}


