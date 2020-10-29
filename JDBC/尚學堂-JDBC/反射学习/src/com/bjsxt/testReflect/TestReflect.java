package com.bjsxt.testReflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.bjsxt.pojo.Person;
import com.bjsxt.pojo.Student;

/**
 * �ǲΤ覡:
 * 		�u���R�A���Ы�java�ﹳ
 * �Ϯg���S�I:
 * 		��{�Fjava��H���ʺA�Ы�.
 * �Ϯg�����I:
 * 		�Ϯg���N�X�Ĳv�C,�v�T�{�ǩʯ�.
 * �}�o�ϥ�:
 * 		�Ϯg�M�ǲε��X���覡
 * �Ϯg�ǲ�:
 * 		������ﹳ
 * 			Class.forName("���������w���|");		�Ы����ﹳ�ϥθ��h
 * 			���W.class							�ާ@�Ϯg��k���h
 * 			�ﹳ�W.getClass()						�ާ@�Ϯg��k���h
 * 			�`�N:
 * 				�@�����u���@�����ﹳ
 * 		�ާ@�ݩ�:
 * 			������ﹳ
 * 			������ݩ�
 * 				getFields()						����Ҧ������@�r�q�]�A����			��^Field[]
 * 				getDeclaredFields()				����Ҧ��n�����r�q(���]�A����)		��^Field[]
 * 				getField(String name)			������w�����@�r�q�]�A����			��^Field
 * 				getDeclaredField(String name)	������w���n�����r�q(���]�A����)		��^Field
 * 			�ާ@���ݩ�
 * 				�ާ@�R�A�ݩ�
 * 					���ݩʹﹳ.get(null) 			��^�R�A�ݩʪ���
 * 					���ݩʹﹳ.set(null,"��")		���
 * 				�ާ@�D�R�A�ݩ�
 * 					���ݩʹﹳ.get(Object obj);
 * 					���ݩʹﹳ.set(Object obj,"��");
 * 		�ާ@��k:
 * 			������ﹳ
 * 			�����k�ﹳ
 * 				getMethods()								����Ҧ������@��k�]�A����
 * 				getDeclaredMethods()						����Ҧ��n������k���]�A����
 * 				getMethod(String name,Class...cla)			������w�����@��k
 * 						String name  	��ܤ�k�W
 * 						Class...cla  	��ܤ�k�������Ѽ����������ﹳ
 * 				getDeclaredMethod(String name,Class...cla)	������w���n����k
 * 						String name  	��ܤ�k�W
 * 						Class...cla  	��ܤ�k�������Ѽ����������ﹳ
 * 			�ާ@��k
 * 				�R�A��k
 * 					��k�ﹳ.invoke(null,�Ѽƭ�1,�Ѽƭ�2,....);
 * 					��k�ﹳ.invoke(null,null);
 * 				�D�R�A��k
 * 					Object obj=cla.newInstance();
 * 					��k�ﹳ.invoke(obj,�Ѽƭ�1,�Ѽƭ�2,....)
 * 					��k�ﹳ.invoke(obj,null)
 * 			�ާ@�c�y��:
 * 				������ﹳ
 * 				����c�y���ﹳ
 * 				�ާ@�c�y���ﹳ
 * @author MyPC
 */
public class TestReflect {
	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException, NoSuchFieldException, SecurityException, NoSuchMethodException, IllegalArgumentException, InvocationTargetException {
		//�Ϯg�ާ@���ݩ� 
			//operField();
		//�Ϯg�ާ@����k
			//operMethod();
		//�Ϯg�ާ@�c�y��
			operConstructor();
	}
	//�Ϯg�ާ@�c�y��
	private static void operConstructor() throws ClassNotFoundException, NoSuchMethodException, SecurityException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		//������ﹳ
		Class cla=Class.forName("com.bjsxt.pojo.Student");
		//����c�y����k�ﹳ
			Constructor[] cs=cla.getConstructors();
			for(Constructor c:cs){
				System.out.println(c.getName());
			}
		//������w���c�y��
			Constructor c=cla.getConstructor(String.class);
		//�Ыع�Ҥƹﹳ
			Object obj=	c.newInstance("�k");
			System.out.println(cla.getDeclaredMethod("getSsex",null).invoke(obj,null));
			
			Student s=new Student("�k");
			System.out.println(s.getSsex());
			
	}
	//�ާ@��k
	private static void operMethod() throws ClassNotFoundException, NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		//������ﹳ
		Class cla=Class.forName("com.bjsxt.pojo.Student");
		//�������k�ﹳ
			//����Ҧ������@��k�]�A����
			Method[] ms=cla.getMethods();
			for(Method m:ms){
				System.out.println("�����k�W--->"+m.getName());
			}
			System.out.println("************************************");
			//����Ҧ��n������k���]�A����
			Method[] ms2=cla.getDeclaredMethods();
			for(Method m:ms2){
				System.out.println("�����k�W--->"+m.getName());
			}
			//������w�����@��k�]�A����
				Method m=cla.getMethod("pHi", int.class,String.class);
				System.out.println(m.getReturnType());
			//������w���n������k,���]�A����
				Method m2=cla.getDeclaredMethod("sHello",null);
				System.out.println(m2.getName());
			//�����k
				//�R�A��k
					Method m3=cla.getDeclaredMethod("sHi",String.class);
					m3.invoke(null, "���ѾǤF�Ϯg,�n�}��");
				//�D�R�A
					Method m4=cla.getDeclaredMethod("sHi",int.class,String.class);
					m4.invoke(cla.newInstance(), 3,"�Ϯg�\��n�j�j");
	}

	public static void operField() throws ClassNotFoundException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InstantiationException{
		//������ﹳ
		Class cla=Class.forName("com.bjsxt.pojo.Student");
		//����Ϯg���ݩ�
			//������Ψ���������@�r�q
				Field[] fds = cla.getFields();
				for(Field f:fds){
					System.out.println("����ݩʦW------>"+f.getName());
					System.out.println("����׹���------>"+f.getModifiers());
					System.out.println("�������------>"+f.getType());//��^���O������Class�ﹳ
				}
				System.out.println("******************************");
			//������n�����Ҧ��r�q
				Field[] fds2=cla.getDeclaredFields();
				for(Field f:fds2){
					System.out.println("����ݩʦW----->"+f.getName());
					System.out.println("����׹���------>"+f.getModifiers());
					System.out.println("�������------>"+f.getType());//��^���O������Class�ﹳ
				}
				System.out.println("******************************");
			//������w���r�q
				Field f=cla.getField("pname");//���w������Ψ���������@�r�q
				System.out.println(f.getName());
				Field f2=cla.getDeclaredField("money");//���w��������Ҧ��r�q
				System.out.println(f2.getName());
				Field f3=cla.getSuperclass().getDeclaredField("pname");//���w��������n�����r�q
				System.out.println(f3.getName());
			//�ާ@�r�q��
				System.out.println("************�ާ@�R�A�r�q**********************");
				//�ާ@�R�A�ݩ�
				Field fs=cla.getDeclaredField("money");
				fs.set(null,2000);
				System.out.println(fs.get(null));
				System.out.println("************�ާ@�D�R�A�r�q**********************");
				//�ާ@�D�R�A�ݩ�
				Field fd=cla.getDeclaredField("sname");
				Object obj=cla.newInstance();
				fd.set(obj, "���|");
				System.out.println(fd.get(obj));	
				//�ɤO�Ϯg�ާ@�p�����ݩ�(�A��)
				Field fd2=cla.getDeclaredField("ssex");
				fd2.setAccessible(true);//�ɤO�Ϯg,�ާ@�p�����ݩ�,���w��
				Object obj2=cla.newInstance();//�����Ҥƹﹳ
				System.out.println(fd2.get(obj2));
				
	}
	//�Ϯg������ﹳ
	public static void getCla() throws ClassNotFoundException{
				//�ǲΤ覡
				Person p=new Person();
				//�Ϯg�Ы����ﹳ
					//�Ĥ@�ؤ覡--->�Ы����ﹳ
					 Class cla01=Class.forName("com.bjsxt.pojo.Person");
					//�ĤG�ؤ覡---->�եΩ��h�ϥΤϮg�ʸ˪���k
					 Class cla02=Person.class;
					//�ĤT�ؤ覡---->�եΩ��h�ϥΤϮg�ʸ˪���k
					 Class cla03=new Person().getClass();
					 System.out.println(cla01==cla02);
					 
					 System.out.println("�������H���]�W---->"+cla01.getPackage());
					 System.out.println("��������׹���----->"+cla01.getModifiers());
					 System.out.println("��������W��(�����w)----->"+cla01.getName());
					 System.out.println("��������W��(���W)----->"+cla01.getSimpleName());
					 System.out.println("����������������ﹳ----->"+cla01.getSuperclass());	
	}
}
//���ﹳ Student��Class�ﹳ �ӹﹳ���ʦs�FStudent���Ҧ��H��
//������H	Student����Ҥƹﹳ new Student()
//��i�T���J�|����   new  ZhangSan().cake
//��J�|����--->���|  Field.get(new Lisi())







