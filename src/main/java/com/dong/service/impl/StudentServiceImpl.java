package com.dong.service.impl;

import com.dong.entity.Student;
import com.dong.mapper.StudentMapper;
import com.dong.service.StudentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dong
 * @create 2020-05-04 21:34
 */
@Service
@Slf4j
public class StudentServiceImpl implements StudentService {


    @Autowired(required = false)
    StudentMapper  studentMapper;
    @Override
    public Student queryStudent(String name, String password) {
        return studentMapper.queryStudent(name,password);
    }

    @Override
    public List<Student> getStudentList(Student student, int page, int limit) {
        return studentMapper.getStudentList(student,page,limit);
    }

    @Override
    public int getStudentListTotal(Student student) {
        return studentMapper.getStudentListTotal(student);
    }

    @Override
    public int addStudent(Student student) {
        return studentMapper.addStudent(student);
    }

    @Override
    public int editStudent(Student student) {
        return studentMapper.editStudent(student);
    }

    @Override
    public int deleteStudent(List<Integer> ids) {
        return studentMapper.deleteStudent(ids);
    }

    @Override
    public void editPassword(Student student, String newPwd) {
        studentMapper.editPassword(student,newPwd);
    }
}
