package demo01;

import java.sql.*;

/**
 * @author kontai
 */
public class Demo01 {
    public static void main(String[] args)
    {
        Connection conn = null;
        PreparedStatement ps = null;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb1", "root", "@@@@@");

            System.out.println("mysql 經連接");
            ps = conn.prepareStatement("select  * from t_demo1 ");
            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next())
                System.out.println(resultSet.getObject("name"));
        } catch (ClassNotFoundException | SQLException e)
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
