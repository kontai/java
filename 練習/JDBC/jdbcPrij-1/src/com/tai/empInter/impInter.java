package com.tai.empInter;

public interface impInter {
     public int updateDB(String  sql,int eid);
     public int delDB(String sql,int eid);
     public int addDB(String sql,Object... obj);

}
