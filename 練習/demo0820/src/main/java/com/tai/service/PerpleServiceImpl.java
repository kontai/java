package com.tai.service;

import com.tai.pojo.People;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class PerpleServiceImpl implements PerpleService {
    @Override
    public List<People> show() throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory=new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        List<People> list=session.selectList("com.tai.PeopleMapper.selAll");
        session.close();
        is.close();
        return list;
    }
}
