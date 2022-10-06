package com.tai.service.imp;

import com.tai.dao.PeopleMapper;
import com.tai.service.PeopleService;
import com.tai.util.MybatisUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PeopleServiceImpl implements PeopleService {
    @Override
    public List<?> showAll() {
        List<?> list = null;
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        PeopleMapper mapper = sqlSession.getMapper(PeopleMapper.class);
        list = mapper.selAll();
        MybatisUtil.closeSqlSession();



        return list;
    }
}
