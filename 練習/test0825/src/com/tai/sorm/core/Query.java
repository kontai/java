package com.tai.sorm.core;

import java.util.List;

@SuppressWarnings("all")
public interface Query {
    /**
     * 直接執行一個DML語句
     *
     * @param sql    sql語句
     * @param params 參數
     * @return 執行sql語句後影響紀錄的行數
     */
    public int executeDMK(String sql, Object[] params);

    /**
     * 將一個對象儲存到數據庫中
     *
     * @param obj 要存儲的對想
     */
    public void insert(Object obj);

    /**
     * 刪除Clazz表示類對應的表中紀錄(指定主鍵值id德紀錄(
     *
     * @param clazz 跟表對應的類的Class對象
     * @param id    主見的值
     */
    public void delete(Class clazz, int id); //update user set uname=?,pwd-?

    /**
     * @param sqll
     * @param clazz
     * @param params
     * @return
     */
    public List qyeryRows(String sqll, Class clazz, Object[] params);


}

