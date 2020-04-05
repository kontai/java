package IO流.XIV_ObjectIOStream對象的序列化與反序列;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class ObjectStreamDemo {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException {
			
//		writeObj();
		readObj();
	}

	public static void readObj() throws IOException, ClassNotFoundException {
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));
		//對象的反序列化。 
		Person p = (Person)ois.readObject();
		
		System.out.println(p.getName()+":"+p.getAge());
		
		ois.close();
		
	}

	public static void writeObj() throws IOException, IOException {
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));
		//對像序列化。  被序列化的對象必須實現Serializable接口。 
		oos.writeObject(new Person("小強",30));
		
		oos.close();
		
		
		
	}

}
