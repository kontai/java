package com.tai.service;

import com.tai.pojo.PageInfo;

import java.io.IOException;

public interface PageInfoService {
    /**
     * 分頁顯示
     * @param pageSize
     * @param pageNumber
     * @return
     */
    PageInfo showPage(int pageSize, int pageNumber) throws IOException;
}
