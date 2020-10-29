package com.bjsxt.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class JdbcUtil {
	private static String driver;
	private static String url;
	private static String username;
	private static String password;
	
	static{
		//創建properties對像獲取屬性文件的內容
		Properties p=new Properties();
		//獲取屬性文件的讀取流對像
		InputStream is=JdbcUtil.class.getResourceAsStream("/db.properties");
		try {
			//加載屬性配置文件
			p.load(is);
			//獲取jdbc參數
			driver=p.getProperty("driver");
			url=p.getProperty("url");
			username=p.getProperty("username");
			password=p.getProperty("password");
			//加載驅動
			Class.forName(driver);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//獲取Connection對像
	public static Connection getConnection(){
		Connection conn=null;
		try {
			 conn=DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return conn;
		
	}
	
	//封裝獲取PreparedStatement對像
	public static PreparedStatement getPreparedStatement(String sql,Connection conn){
		
		PreparedStatement ps=null;
		try {
			ps =conn.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ps;
		
	}
	
	//封裝獲取Statement對像
	public static Statement getStatement(Connection conn){
		Statement stmt=null;
		try {
			stmt = conn.createStatement();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return stmt;
		
	}
	
	//關閉資源
	public static void closeAll(ResultSet rs,Statement stmt,Connection conn){
		try {
			rs.close();
		} catch (Exception e) {
			
		}
		try {
			stmt.close();
		} catch (SQLException e) {
			
		}
		try {
			conn.close();
		} catch (SQLException e) {
			
		}
	}
	
	//封裝DML
	public static int executeDML(String sql,Object...objs){
		//創建連接對像
		Connection conn=getConnection();
		//創建sql命令對像
		PreparedStatement ps=JdbcUtil.getPreparedStatement(sql, conn);
		//給佔位符賦值
			try {
				conn.setAutoCommit(false);
				for(int i=0;i<objs.length;i++){
					ps.setObject(i+1, objs[i]);
				}
				int i=ps.executeUpdate();
				conn.commit();
				return i;
			} catch (Exception e) {
					try {
						conn.rollback();
					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			}finally{
				//關閉資源
				JdbcUtil.closeAll(null, ps, conn);
			}
			//返回結果
			return -1;
	}
}
