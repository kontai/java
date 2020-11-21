package com.tai.connUtil;

import com.tai.containEmp.*;
import com.tai.connInterface.connInter;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.Properties;

/**
 * @author kontai
 */
public class conn implements connInter {
    private static String driver;
    private static String url;
    private static String username;
    private static String password;


    static {
        Properties prop = new Properties();
        InputStream pin = conn.class.getResourceAsStream("../conn4Mysql.properties");
        try {
            prop.load(pin);
        } catch (IOException e) {
            e.printStackTrace();
        }
        driver = prop.getProperty("driver");
        url = prop.getProperty("url");
        username = prop.getProperty("username");
        password = prop.getProperty("password");

        try {
            Class.forName(driver);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    /**
     * Gets connection.
     *
     * @return the connection
     * 創建連接對象
     */
    @Override
    public  Connection getConnection() {

        Connection conn = null;
        try {
            System.out.println(url+" "+username+" "+password);
            conn = DriverManager.getConnection(url, username, password);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return conn;
    }

    //創建SQL命令對象
    @Override
    public  PreparedStatement getPreparedStatement(String sql, Connection conn) {
        PreparedStatement ps = null;
        try {
            ps = conn.prepareStatement(sql);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return ps;
    }

    //關閉資源
    @Override
    public  void closeAllRes(ResultSet rs, PreparedStatement ps, Connection conn) {
        try {
            rs.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
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

    @Override
    public int execDML(String sql, Object... obj){
        PreparedStatement ps=null;

        //返回值
        int ret=0;
        try {
            ps=getConnection().prepareStatement(sql);
            for(int i=0;i<obj.length;i++){
                ps.setObject(i+1,obj[i]);
            }
           ret= ps.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        try {
            ps.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return ret;
    }

    public void selAll(String sql){
        Connection conn =null;
        PreparedStatement ps=null;
        ResultSet rs = null;

        ArrayList<Emp> list = new ArrayList<>();
        try {

            conn =getConnection();
            /*

             */
            ps = getPreparedStatement(sql,conn);
            rs = ps.executeQuery();
            while (rs.next()) {
                Emp e = new Emp();
                e.setEmpno(rs.getInt("empno"));
                e.setEname(rs.getString("ename"));
                e.setJob(rs.getString("job"));
                e.setMgr(rs.getInt("mgr"));
//                String date = new SimpleDateFormat().format(rs.getDate("hiredate").getTime());
                e.setHiredate(rs.getDate("hiredate"));
                e.setSal(rs.getDouble("sal"));
                e.setComm(rs.getDouble("comm"));
                e.setDeptno(rs.getInt("deptno"));
                list.add(e);
                System.out.println("epmno" + "\t" + "ename" + "\t" + "job   " + "\t\t" + "mgr" + "\t\t\t" + "hiredate" + "\t" + "sal" + "\t\t" + "comm" + "\t\t" + "deprno");
                System.out.println(e.getEmpno() + "\t" + e.getEname() + "\t" + e.getJob() + "\t\t" + e.getMgr() + "\t\t" + e.getHiredate() + "\t" + e.getSal() + "\t" + e.getComm() + "\t\t\t" + e.getDeptno()+"\n");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            closeAllRes(rs,ps,conn);
        }
    }
}
