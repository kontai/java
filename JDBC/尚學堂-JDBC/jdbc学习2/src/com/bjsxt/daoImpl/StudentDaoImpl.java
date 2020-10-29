package com.bjsxt.daoImpl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.bjsxt.pojo.Student;

public class StudentDaoImpl {
	//查詢所有學生信息
	public ArrayList<Student> getStudentInfo() throws ClassNotFoundException, SQLException{
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
					 return list;
	}
	
	
	
	//根據新的暱稱修改用戶暱稱
	public int updateSname(String newName) throws ClassNotFoundException, SQLException{
		//加載驅動
				Class.forName("oracle.jdbc.driver.OracleDriver");
				//創建連接對像
				Connection conn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "oracle");
				//設置事務手動提交
				conn.setAutoCommit(false);
				//創建sql命令對像
				Statement stmt=conn.createStatement();
				//創建sql命令
					String sql="update student set sname='"+newName+"' where snum=6";
				//執行sql命令
					int i=-1;
					try {
						 i=stmt.executeUpdate(sql);
						conn.commit();
						
					} catch (Exception e) {
						conn.rollback();
					}
				//關閉資源
					stmt.close();
					conn.close();
					return i;
	
	} 
}
