package Intro01;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

public class JDBCUtil {

    static String driverClass = null;
    static String url = null;
    static String name = null;
    static String password = null;

    static
    {
        try
        {
            //            InputStream is = new FileInputStream(driverClass);
            System.out.println("01");
            Properties prop = new Properties();
            File file;
            InputStream is=new FileInputStream("jdbc.properties");
//            InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties");

            prop.load(is);

            System.out.println("02");
            //read attribute
            driverClass = prop.getProperty("driverClass");
            url = prop.getProperty("url");
            name = prop.getProperty("name");
            password = prop.getProperty("password");
        } catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public static Connection getConn() throws Exception
    {
        System.out.println("0");
        Class.forName(driverClass);
        System.out.println("1");
        return DriverManager.getConnection(url, name, password);
    }

    public static void release(Connection conn, Statement st, ResultSet rs)/*throws SQLException*/
    {
        closeResult(rs);
        closeStatement(st);
        closeConn(conn);
    }

    private static void closeResult(ResultSet rs)
    {
        try
        {
            if (rs != null)
            { rs.close(); }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }

    private static void closeStatement(Statement st)
    {
        try
        {
            if (st != null)
            { st.close(); }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }


    private static void closeConn(Connection conn)
    {
        try
        {
            if (conn != null)
            { conn.close(); }
        } catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
