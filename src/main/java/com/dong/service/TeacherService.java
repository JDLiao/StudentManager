package com.dong.service;

import com.dong.entity.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author dong
 * @create 2020-05-04 21:47
 */
public interface TeacherService {

    Teacher queryTeacher(String name,  String password);

    //获取老师列表
    List<Teacher> getTeacherList(Teacher teacher, int page, int limit);

    int getTeacherListTotal(Teacher teacher);

    //增加老师
    void addTeacher(Teacher teacher);

    //编辑老师
    void editTeacher(Teacher teacher);

    //删除老师
    void deleteTeacher( List<Integer> ids);

    //修改老师密码
    void editPassword( Teacher teacher, String newPwd);

}
