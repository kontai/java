package demo01;

import java.io.*;
import java.sql.*;

/**
 * The type Demo 02.
 *
 * @author kontai
 */
public class Demo02 {
    /**
     * The entry point of application.
     *  使用CLOB將大數據儲存到MySql
     * @param args the input arguments
     */
    public static void main(String[] args)
    {
        Connection conn = null;
        PreparedStatement ps = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb1", "root", "@@@@@");
            System.out.println("mysql 已經連接");

/*
            //寫入
            ps = conn.prepareStatement("insert  into t_demo1 (name,myinfo) values(?,?)");
            ps.setString(1,"JJ");
//            ps.setString(2,"hello");
            ps.setClob(2,new BufferedReader(new InputStreamReader(new ByteArrayInputStream("aaabbbbabaab".getBytes()))));
            ps.executeUpdate();
            System.out.println("修改成功!");
*/

            //取出
            ps = conn.prepareStatement("select * from t_demo1 where id=?");
            ps.setInt(1, 2);
            try (ResultSet resultSet = ps.executeQuery())
            {
                while (resultSet.next())
                {
                    //                    System.out.println(resultSet.getObject("myinfo"));
                    Clob clob = resultSet.getClob("myinfo");
                    Reader r = clob.getCharacterStream();
                    int temp = 0;
                    while ((temp = r.read()) != -1)
                        System.out.print((char) temp);
                }
            }

        } catch (ClassNotFoundException | SQLException | IOException e)
        {
            e.printStackTrace();
        } finally

        {
            if (ps != null)
            {
                try
                {
                    ps.close();
                } catch (SQLException throwables)
                {
                    throwables.printStackTrace();
                }
            }

            if (conn != null)
            {
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
}
