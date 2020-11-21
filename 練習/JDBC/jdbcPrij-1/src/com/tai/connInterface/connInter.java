package com.tai.connInterface;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author kontai
 */
public interface connInter {
     Connection getConnection();

     PreparedStatement getPreparedStatement(String sql, Connection conn);

     void closeAllRes(ResultSet rs, PreparedStatement ps, Connection conn);

     int execDML(String sql, Object... obj);
}