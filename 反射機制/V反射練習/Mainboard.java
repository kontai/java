package 反射機制.V反射練習;

import Temp.PCI;

public class Mainboard {

	public void run() {
		System.out.println("main board run....");
	}

	public void usePCI(PCI p) {//PCI p = new SouncCard();
		if (p != null) {
			p.open();
			p.close();
		}
	}
}
