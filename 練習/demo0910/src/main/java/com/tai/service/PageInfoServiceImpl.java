package com.tai.service;

import com.tai.pojo.Log;
import com.tai.pojo.PageInfo;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PageInfoServiceImpl implements PageInfoService {
    @Override
    public PageInfo showPage(int pageSize, int pageNumber) throws IOException {
        InputStream in = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(in);
        SqlSession session = factory.openSession();

        Map<String, Object> map = new HashMap<>();
        map.put("pageSize", pageSize);
        map.put("pageStart", pageSize * (pageNumber - 1));
        List<Log> list = session.selectList("com.tai.PageInfoMapper.selPage", map);
        long total = session.selectOne("com.tai.PageInfoMapper.selCount");
        //設置頁數
        total=total%pageSize==0?total/pageSize:total/pageSize+1;

        PageInfo pi = new PageInfo();
        pi.setPageSize(pageSize);
        pi.setPageNumber(pageNumber);
        pi.setTotal(total);
        pi.setList(list);

        return pi;
    }
}
