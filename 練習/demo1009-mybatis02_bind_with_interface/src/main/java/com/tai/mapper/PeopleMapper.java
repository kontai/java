package com.tai.mapper;

import com.tai.pojo.People;

import java.util.List;

public interface PeopleMapper {
    /**
     * mybatis接口綁定
     * @return
     */
    List<People> selAll();
}
