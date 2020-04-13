package 網路編程.I_IP對象;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPDemo {

	/**
	 * @param args
	 * @throws UnknownHostException 
	 */
	public static void main(String[] args) throws UnknownHostException {

		//獲取本地主機ip地址對象。 
		InetAddress ip = InetAddress.getLocalHost();
		
		//獲取其他主機的ip地址對象。
//		ip = InetAddress.getByName("192.168.1.110");//InetAddress.getByName("my_think");
		System.out.println(ip.getHostAddress());
		System.out.println(ip.getHostName());

		InetAddress[] ip2 = InetAddress.getAllByName("www.yahoo.com");//InetAddress.getByName("my_think");
		for(InetAddress i:ip2)
		{
			System.out.println(i.getHostAddress());
			System.out.println(i.getHostName());
		}
	}

}
