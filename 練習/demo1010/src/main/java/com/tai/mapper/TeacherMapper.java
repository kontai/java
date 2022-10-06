package com.tai.mapper;

import com.tai.pojo.Teacher;

import java.util.List;


/**
 * The interface Teacher mapper.
 */
public interface TeacherMapper {
    /**
     * Sel all teacher.
     *
     * @return the teacher
     */
    List<Teacher> selAll();
    List<Teacher> selById();
}
