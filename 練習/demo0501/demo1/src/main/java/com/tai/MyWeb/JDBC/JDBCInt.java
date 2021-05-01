package com.tai.MyWeb.JDBC;

import com.tai.MyWeb.User.*;

public interface JDBCInt {
    User LoginCheck(String uname, String pwd);
}
