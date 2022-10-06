package com.tai.sesrvice;

import com.tai.mapper.StudentMapper;
import com.tai.mybatisUtil.mybatisUtil;
import com.tai.pojo.Student;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> showStudent() {
        SqlSession session = mybatisUtil.getSession();
        StudentMapper mapper = session.getMapper(StudentMapper.class);
        List<Student> stu = mapper.sel();
        return stu;
    }
}
