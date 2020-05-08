package com.dong.service;

import com.dong.entity.Student;
import com.dong.mapper.StudentMapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author dong
 * @create 2020-05-04 21:33
 */
public interface StudentService {

    Student queryStudent(String name, String password);

    //获取学生列表
    List<Student> getStudentList(Student student,int page,  int limit);

    //获取学生总数
    int getStudentListTotal(Student student);

    //插入学生
    int addStudent(Student student);

    //编辑学生
    int editStudent(Student student);

    //删除学生
    int deleteStudent(List<Integer> ids);

    //修改该学生的密码
    void editPassword(Student student,String newPwd);
}
