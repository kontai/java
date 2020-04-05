package IO流.XIII_序列流sequenceInputStream.示例_文件分割與合併;

import java.io.Serializable;
/*
 * Serializable:用於給被序列化的類加入ID號。
 * 用於判斷類和對象是否是同一個版本。 
 */
public class Person implements Serializable/*標記接口*/ {

	/**
	 * transient:非靜態數據不想被序列化可以使用這個關鍵字修飾。 
	 */
	private static final long serialVersionUID = 9527l;
	private transient String name;
	private static int age;
	
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
