package com.tai.service;

import com.tai.pojo.PageInfo;
import com.tai.pojo.People;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PeopleServiceImpl implements PeopleService {
    private final static int SIZE = 2;

    @Override
    public PageInfo show(int pageSize, int pageNumber) throws IOException {

        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();

        Map<String, Object> map = new HashMap<>();
        map.put("pageStart", pageSize * (pageNumber - 1));
        map.put("pageSize", pageSize);

        PageInfo info = new PageInfo();
        info.setPageSize(pageSize);
        info.setPageNumber(pageNumber);

        info.setList(session.selectList("com.tai.PeopleMapper.selAll", map));
        int count = session.selectOne("com.tai.PeopleMapper.count");
        info.setTotal(count % pageSize == 0 ? count / pageSize : count / pageSize + 1);
        System.out.println("pageTotal="+info.getTotal());
        ;
        return info;
    }

}
