package com.tai.test;

import com.tai.pojo.Student;
import com.tai.sesrvice.StudentService;
import com.tai.sesrvice.StudentServiceImpl;

import java.util.List;

public class test {
    public static void main(String[] args) {
//        TeacherService service=new TeacherServiceImpl();
//        List<Teacher> teacher =  service.showTeacher();
        StudentService service = new StudentServiceImpl();
        List<Student> student = service.showStudent();
        System.out.println(student);
    }
}
