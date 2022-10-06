package com.tai.sesrvice;

import com.tai.pojo.Teacher;

import java.util.List;

public interface TeacherService {
    List<Teacher> showTeacher();
    List<Teacher> showById();
}
