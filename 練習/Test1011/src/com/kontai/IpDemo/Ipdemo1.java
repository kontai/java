package src.com.kontai.IpDemo;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class Ipdemo1 {
    public static void main(String[] args) throws UnknownHostException
    {
        InetAddress ip = InetAddress.getByName("localhost");
        //        getInfo(ip);

        InetAddress google = InetAddress.getByName("www.google.com");
        new Thread() {
            @Override
            public void run()
            {
                try
                {
                    while (true)
                    {
                        //                    wait(3000);
                        sleep(2000);
                        getInfo(google);
                    }
                } catch (Exception e) {}
            }
        }.start();

        //        InetAddress google=InetAddress.getByName("8.8.8.8");
        //        getInfo(google);
    }

    private static void getInfo(InetAddress ip)
    {
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
        System.out.println(ip.getAddress());
        System.out.println(ip.getCanonicalHostName());
    }


}

