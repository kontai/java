package com.kontai.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author kontai
 * <p>
 * jdbc新增學習
 * 1.導入
 */
public class TestInsert1 {
    public static void main(String[] args)
    {

        String jdbcurl = "jdbc:oracle:thin:@localhost:1521:XE";
        //獲取數據庫連接對象(連接指定數據庫)
        Connection conn = null;
        //創建sql命令對象
        Statement stmt = null;
        try
        {
            //加載驅動類
//            Class.forName("oracle.jdbc.driver.OracleDriver");
            conn = DriverManager.getConnection(jdbcurl, "tai", "tai");
            stmt = conn.createStatement();
            int i=stmt.executeUpdate("insert into test values(1,'jj','大園')");
            System.out.println("執行結果:" + i);
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        } finally
        {
            //關閉資源
            try
            {
                stmt.close();
            } catch (SQLException throwables)
            {
                throwables.printStackTrace();
            }
            try
            {
                conn.close();
            } catch (SQLException throwables)
            {
                throwables.printStackTrace();
            }
        }
    }
}
