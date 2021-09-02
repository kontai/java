package com.tai.pojo;

import java.util.List;

public class PageInfo {
    //每頁顯示個數
    private int pageSize;
    //當前第幾頁
    private int pageNumber;
    //總頁數
    private long total;
    //當前頁顯示的數據
    private List<?> list;


    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public List<?> getList() {
        return list;
    }

    public void setList(List<?> list) {
        this.list = list;
    }
}

