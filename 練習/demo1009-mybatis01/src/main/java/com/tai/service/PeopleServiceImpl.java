package com.tai.service;

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
    private List<People> list;

    @Override
    public List<People> showPeople() {
        InputStream is = null;
        SqlSession session = null;

        try {
            is = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
            session = factory.openSession();


            list = session.selectList("selAll");
            int total = 10;
            int count = 0;

            Map<String, String> map = new HashMap<>();
            for (int i = 0; i < total; i++) {
                map.put("name", "飛煙" + i);
                map.put("age", 20 + i + "");
                count += session.insert("ins", map);
            }
            System.out.println("count=" + count);


            session.commit();
            session.close();
        } catch (IOException e) {
            session.rollback();
            e.printStackTrace();
        }

        return list;
    }
}
