package com.tai.service.impl;

import com.tai.pojo.People;
import com.tai.service.PeopleService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.beans.PropertyEditor;
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PeopleServiceImpl implements PeopleService {
    @Override
    public People show(String name) {
        People ppl = null;

        InputStream is = null;
        SqlSession session = null;
        Properties prop = null;
        try {
            is = Resources.getResourceAsStream("mybatis.xml");
            SqlSessionFactoryBuilder sb = new SqlSessionFactoryBuilder();
            SqlSessionFactory factory = sb.build(is);
            session = factory.openSession();

            Map<String, Object> map = new HashMap<>();
            map.put("name", name);

//            ppl=session.selectOne("com.tai.mapper.PeopleMapper.selById",1);
            People ppls = new People(23, "tai", 22);
            ppl = session.selectOne("com.tai.mapper.PeopleMapper.selByName", map);
            prop = new Properties();
            prop.put("name", ppl.getName());
            OutputStream os = new FileOutputStream("1.xml");
            prop.storeToXML(os, "what ever");

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            if (session != null) {
//            session.close();
            }
            try {
                is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }


        return ppl;
    }
}
