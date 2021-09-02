package com.tai.service;

import com.tai.pojo.PageInfo;
import com.tai.pojo.People;

import java.io.IOException;
import java.util.List;

public interface PeopleService {
    /**
     * 分頁顯示
     * @param pageSize
     * @param pageNumber
     * @return
     * @throws IOException
     */
    PageInfo show(int pageSize,int pageNumber) throws IOException;
}
