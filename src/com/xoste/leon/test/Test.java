package com.xoste.leon.test;

import com.xoste.leon.pojo.Student;
import com.xoste.leon.pojo.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Test {
    public static void main(String[] args) throws IOException {
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
        SqlSession session = factory.openSession();
        /*List<Student> studentList = session.selectList("com.xoste.leon.mapper.StudentMapper.selAll");
        System.out.println(studentList);*/

        List<Teacher> teacherList = session.selectList("com.xoste.leon.mapper.TeacherMapper.selAll");
        for (Teacher teacher : teacherList) {
            System.out.println(teacher);
        }
        session.close();
        System.out.println("程序执行结束");
    }
}
