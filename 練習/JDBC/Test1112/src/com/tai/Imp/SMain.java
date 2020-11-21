package com.tai.Imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Statemen實現
 * sql: EID Ename Eage
 *
 * @author kontai
 */
public class SMain {
    public static void main(String[] args) {
        //sql url,username,password
//        jdbc:oracle:thin:@localhost:1521:XE
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "tai";
        String password = "tai";
        String eid = "2";
        String ename = "jj";
        String eage = "12";
        //加載驅動
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        //創建連接對象
        Connection conn = null;
        //創建SQL命令對象
        Statement stmt = null;
        //創建SQL命令
        String sql = "insert into test values('" + eid + "','" + ename + "','" + eage + "')";
        try {
            conn = DriverManager.getConnection(url, username, password);
            stmt = conn.createStatement();
            //執行SQL命令
            int i=stmt.executeUpdate(sql);
            System.out.println("執行結果:"+i);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        //關閉資源
        try {
            stmt.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            conn.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
