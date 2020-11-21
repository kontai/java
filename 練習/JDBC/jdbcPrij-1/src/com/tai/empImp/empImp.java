package com.tai.empImp;

import com.tai.connUtil.conn;
import com.tai.empInter.impInter;

public class empImp implements impInter {
    conn c=new conn();
    @Override
    public int updateDB(String sql, int eid) {
        return c.execDML(sql,eid);
    }

    @Override
    public int delDB(String sql, int eid) {
        return c.execDML(sql,eid);
    }

    @Override
    public int addDB(String sql, Object... obj) {
        return c.execDML(sql,obj);
    }
}
