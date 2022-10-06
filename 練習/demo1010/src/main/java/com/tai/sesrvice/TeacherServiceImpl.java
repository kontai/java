package com.tai.sesrvice;

import com.tai.mapper.TeacherMapper;
import com.tai.mybatisUtil.mybatisUtil;
import com.tai.pojo.Teacher;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class TeacherServiceImpl implements TeacherService {
    @Override
    public List<Teacher> showTeacher() {
        SqlSession session= mybatisUtil.getSession();
        TeacherMapper mapper=  session.getMapper(TeacherMapper.class);
//        Teacher teacher=session.selectOne("selAll");
        List<Teacher> teacher=mapper.selAll();
        return teacher;
    }

    @Override
    public List<Teacher> showById() {
        SqlSession session= mybatisUtil.getSession();
        TeacherMapper mapper=  session.getMapper(TeacherMapper.class);
        List<Teacher> teacher=mapper.selById();
        return null;
    }
}
