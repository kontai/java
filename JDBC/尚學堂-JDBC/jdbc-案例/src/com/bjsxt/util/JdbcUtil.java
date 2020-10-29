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
		//�Ы�properties�ﹳ����ݩʤ�󪺤��e
		Properties p=new Properties();
		//����ݩʤ��Ū���y�ﹳ
		InputStream is=JdbcUtil.class.getResourceAsStream("/db.properties");
		try {
			//�[���ݩʰt�m���
			p.load(is);
			//���jdbc�Ѽ�
			driver=p.getProperty("driver");
			url=p.getProperty("url");
			username=p.getProperty("username");
			password=p.getProperty("password");
			//�[���X��
			Class.forName(driver);
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//���Connection�ﹳ
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
	
	//�ʸ����PreparedStatement�ﹳ
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
	
	//�ʸ����Statement�ﹳ
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
	
	//�����귽
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
	
	//�ʸ�DML
	public static int executeDML(String sql,Object...objs){
		//�Ыسs���ﹳ
		Connection conn=getConnection();
		//�Ы�sql�R�O�ﹳ
		PreparedStatement ps=JdbcUtil.getPreparedStatement(sql, conn);
		//������Ž��
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
				//�����귽
				JdbcUtil.closeAll(null, ps, conn);
			}
			//��^���G
			return -1;
	}
}
