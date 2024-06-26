package 網路編程.II_UDP.聊天室;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Rece implements Runnable {

	private DatagramSocket ds;

	public Rece(DatagramSocket ds) {
		this.ds = ds;
	}

	@Override
	public void run() {
		try {
			while (true) {

				// 2,創建數據包。
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf, buf.length);

				// 3,使用接收方法將數據存儲到數據包中。
				ds.receive(dp);// 阻塞式的。

				// 4，通過數據包對象的方法，解析其中的數據,比如，地址，端口，數據內容。
				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				String text = new String(dp.getData(), 0, dp.getLength());
				
				System.out.println(ip + "::" + text);
				if(text.equals("886")){
					System.out.println(ip+"....退出聊天室");
				}

			}
		} catch (Exception e) {

		}

	}

}
