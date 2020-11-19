package com.tai.conn;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnImp {
    public int getConn(){
        //載入驅動
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        //建立連接對象
        //"jdbc:oracle:thin:@localhost:1521:xe","system","oracle");
        String url="jdbc:oracle:thin:@localhost:1521:xe";
        String username="tai";
        String password="tai";
        Connection conn=null;
        //建立sql命令對象
        Statement stmt=null;


        int i=0;
        //不自動提交
        try
        {
            conn= DriverManager.getConnection(url,username,password);
            conn.setAutoCommit(false);
            stmt=conn.createStatement();

            //建立sql命令
            String command="insert into test values(2,'jj',22)";
            //執行命令
            i=stmt.executeUpdate(command);
            conn.commit();
        } catch (SQLException throwables)
        {
            try
            {
                assert conn != null;
                conn.rollback();
            } catch (SQLException e)
            {
                e.printStackTrace();
            }
            throwables.printStackTrace();
        }finally
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
        return i;
    }
}
