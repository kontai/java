package com.tai.conn;

import com.tai.user.User;

import java.sql.*;
import java.util.ArrayList;

public class ConnImp {
    private final String url="jdbc:oracle:thin:@localhost:1521:xe";
    private final String username="tai";
    private final String password="tai";
    public int getUpdate(){
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

    public ArrayList<User> getQuery()
    {
        ArrayList<User> arr=new ArrayList<>();
        //載入驅動
        try
        {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        //建立連接對象
        Connection conn=null;
        //建立SQL命令對象
        Statement stmt=null;

        try
        {
            conn=DriverManager.getConnection(url,username,password);
            stmt=conn.createStatement();

            //執行SQL命令
            ResultSet res = stmt.executeQuery("select * from test");
            while(res.next())
            {

                User user=new User();
                user.setEid(res.getInt("eid"));
                user.setEname(res.getString("ename"));
                user.setEage(res.getInt("eage"));

                arr.add(user);
            }
        } catch (SQLException throwables)
        {
            throwables.printStackTrace();
        }finally
        {
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
            //關閉連接
        }
        //返回查詢結果
        return arr;
    }
}
