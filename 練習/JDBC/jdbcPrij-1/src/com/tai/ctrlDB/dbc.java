package com.tai.ctrlDB;

import com.tai.containEmp.*;
import com.tai.connUtil.*;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

//import static com.tai.connUtil.conn.closeAllRes;
//import static com.tai.connUtil.conn.getPreparedStatement;
//import static com.tai.connUtil.conn.getConnection;


/**
 * @author kontai
 */
public class dbc {
    public static void main(String[] args) {
//        new conn().selAll("select * from emp where sal>2000");
        new conn().selAll("select * from employee.emp where sal>2000");


    }

}
