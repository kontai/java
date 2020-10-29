package com.bjsxt.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bjsxt.daoImpl.StudentDaoImpl;
import com.bjsxt.pojo.Student;

/**
 * JDBC的查詢:
 * 		加載驅動
 * 		創建連接對像
 * 		創建sql命令對像
 * 		創建sql命令
 * 		執行sql命令
 * 			返回存儲了查詢到的數據的對象(ResultSet)
 * 				ResultSet對象是基於指針進行數據存儲的,類似枚舉.
 * 		關閉資源
 * 問題:
 * 		查詢的返回值類型是ResultSet,是基於指針盡心數據存儲的,不便於數據的針對性的獲取.
 * 解決:
 * 		將數據轉換到ArrayList中進行存儲.
 * 使用:
 * 		創建和表結構相同的實體類進行單條數據的存儲(一條數據就是一個實例化對像)
 * 		將對像存儲到ArrayList中.
 * 快速獲取返回值:
 * 		alt+shift+L
 * 
 * @author MyPC
 *
 */
public class TestSelect {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//聲明List集合
		ArrayList<Student> list=new ArrayList<>();
		//加載驅動
			Class.forName("oracle.jdbc.driver.OracleDriver");
		//創建連接對像
			Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","scott","oracle");
		//創建sql命令對像
			Statement stmt=conn.createStatement();
		//創建Sql命令
			String sql="select * from student";
		//執行Sql命令
			 ResultSet rs = stmt.executeQuery(sql);
			 while(rs.next()){
				 //創建學生對像
				 Student stu=new Student();
				 stu.setSnum(rs.getInt("snum"));
				 stu.setSname(rs.getString("sname"));
				 stu.setSage(rs.getInt("sage"));
				 stu.setMoney(rs.getDouble("money"));
				 //將對像存儲到ArrayList中
				 list.add(stu);
			 }
		
		System.out.println(list.get(2));
		//創建DaoImpl層對像
		StudentDaoImpl sd=new StudentDaoImpl();
		ArrayList<Student> ls=sd.getStudentInfo();
	}
}
