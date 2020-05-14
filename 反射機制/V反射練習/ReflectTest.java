package 反射機制.V反射練習;

import Temp.PCI;

import java.io.File;
import java.io.FileInputStream;

import java.util.Properties;


/*
 * 電腦運行。 
 */
public class ReflectTest {

	/**
	 * @param args
	 * @throws Exception 
	 */
	public static void main(String[] args) throws Exception {

		Mainboard mb = new Mainboard();
		mb.run();
		//每次添加一個設備都需要修改代碼傳遞一個新創建的對象
//		mb.usePCI(new SoundCard());
		//能不能不修改代碼就可以完成這個動作。 
//		不用new來完成，而是只獲取其class文件。在內部實現創建對象的動作。 
		
		File configFile = new File("反射機制/V反射練習/pci.properties");
		
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(configFile);
		
		prop.load(fis);
		
		for(int x=0; x<prop.size(); x++){
			
			String pciName = prop.getProperty("pci"+(x+1));
			
			Class clazz = Class.forName(pciName);//用Class去加載這個pci子類。 
			
			PCI p = (PCI)clazz.newInstance();
			
			mb.usePCI(p);
		}
		
		fis.close();
		
		
	}

}
