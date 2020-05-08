package com.dong.service.impl;

import com.dong.entity.Teacher;
import com.dong.mapper.TeacherMapper;
import com.dong.service.TeacherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dong
 * @create 2020-05-04 21:47
 */
@Service
@Slf4j
public class TeacherServiceImpl implements TeacherService {

    @Autowired(required = false)
    TeacherMapper teacherMapper;
    @Override
    public Teacher queryTeacher(String name, String password) {
        return teacherMapper.queryTeacher(name,password);
    }

    @Override
    public List<Teacher> getTeacherList(Teacher teacher, int page, int limit) {
        return teacherMapper.getTeacherList(teacher,page,limit);
    }

    @Override
    public int getTeacherListTotal(Teacher teacher) {
        return teacherMapper.getTeacherListTotal(teacher);
    }

    @Override
    public void addTeacher(Teacher teacher) {
        teacherMapper.addTeacher(teacher);
    }

    @Override
    public void editTeacher(Teacher teacher) {
        teacherMapper.editTeacher(teacher);
    }

    @Override
    public void deleteTeacher(List<Integer> ids) {
        teacherMapper.deleteTeacher(ids);
    }

    @Override
    public void editPassword(Teacher teacher, String newPwd) {
        teacherMapper.editPassword(teacher,newPwd);
    }
}
