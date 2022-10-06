package com.tai.service;

import com.tai.mapper.*;
import com.tai.mybatisUtil.mybatisUtil;
import com.tai.pojo.People;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PeopleServiceImpl implements PeopleService {
    private List<People> list;

    @Override
    public List<People> showPeople() {
        SqlSession session = mybatisUtil.getSession();
        PeopleMapper mapper=session.getMapper(PeopleMapper.class);
        list=mapper.selAll();

        return list;
    }
}
