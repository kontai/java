package com.tai.Imp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * PreparedStatement實現
 *
 * @author kontai
 */
public class PMain {
    public static void main(String[] args) {
        //加載驅動
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        String url = "jdbc:oracle:thin:@localhost:1521:XE";
        String username = "tai";
        String password = "tai";
        //創建連接對象
        Connection conn = null;
        //創建SQL命令
        String sql = "delete test where eid=?";
        //創建SQL命令對象
        PreparedStatement ps = null;
        try {
            conn = DriverManager.getConnection(url, username, password);
            conn.setAutoCommit(false);
            ps = conn.prepareStatement(sql);
            ps.setInt(1, 2);
            //執行SQL命令
            int i = ps.executeUpdate();
            System.out.println("執行結果:" + i);
            conn.commit();
        } catch (SQLException throwables) {
            try {
                conn.rollback();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        }

        //關閉資源
        try {
            ps.close();
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
