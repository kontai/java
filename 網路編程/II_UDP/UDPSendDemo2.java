package 網路編程.II_UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDPSendDemo2 {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {

		System.out.println("發送端啟動......");
		/*
		 * 創建UDP傳輸的發送端。
		 * 思路：
		 * 1，建立udp的socket服務。
		 * 2，將要發送的數據封裝到數據包中。 
		 * 3，通過udp的socket服務將數據包發送出去。
		 * 4，關閉socket服務。
		 */
		//1,udpsocket服務。使用DatagramSocket對象。
		DatagramSocket ds = new DatagramSocket(8888);
		
		
//		String str = "udp傳輸演示：哥們來了！";
		BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
		String line = null;
		
		while((line=bufr.readLine())!=null){
			
			
			byte[] buf = line.getBytes();
			DatagramPacket dp = 
					new DatagramPacket(buf,buf.length,InetAddress.getByName("192.168.1.100"),10000);
			ds.send(dp);
			
			if("886".equals(line))
				break;
		}
		
		//4，關閉資源。
		ds.close();
		
		
	}

}
