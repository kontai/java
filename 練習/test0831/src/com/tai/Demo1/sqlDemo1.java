package com.tai.Demo1;

import java.sql.*;

public class sqlDemo1 {
    public static void main(String[] args)
    {
        Connection conn =null;
        PreparedStatement ps = null;
        //載入模塊
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb1", "root", "@@@@@");
            System.out.println("-------建立連接-------");
            ps = conn.prepareStatement("select * from t_datetest;");
            ps.executeQuery();
            ResultSet rs = ps.getResultSet();
            while(rs.next())
            {
                System.out.printf("id=%d , name=%s , age=%d , date=%s%n",rs.getInt(1),rs.getString(2),rs.getInt(3),rs.getDate(4));
            }

        } catch (ClassNotFoundException | SQLException e)
        {
            e.printStackTrace();
        }


    }
}
