package Intro01;

import com.mysql.jdbc.Driver;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.*;

import static javax.net.ssl.SSLContext.getDefault;

/**
 * @author kontai
 */
public class JDBCDemo {
    public static void main(String[] args) throws Exception
    {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        try
        {
            conn=JDBCUtil.getConn();
            st = conn.createStatement();
            String sql = "select * from t_stu";
            rs = st.executeQuery(sql);

            while (rs.next())
            {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID:" + id + "\nname:" + name + "\nage:" + age);
                System.out.printf("\n");
            }
        } catch (SQLException e)
        {
            e.printStackTrace();
        } finally
        {
            JDBCUtil.release(conn, st, rs);
        }


    }
}
