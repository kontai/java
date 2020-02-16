package 集合框架.III泛型.III_自定義泛型.I泛型類;



public class GenericDefineDemo3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		
		Tool<Student> tool = new Tool<Student>();
		
//		tool.setObject(new Worker());
		tool.setObject(new Student());
		Student stu = tool.getObject();
//		Tool tool = new Tool();
//		tool.setObject(new Worker());
//		Student stu = (Student)tool.getObject();
		
		
	}

}


