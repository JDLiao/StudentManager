package com.dong.service;

import com.dong.entity.Course;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author dong
 * @create 2020-05-06 16:46
 */
public interface CourseService {

    //获得课程列表
    List<Course> getCourseList(Course course, int page,  int limit);

    //获得课程总数
    int getCourseListTotal(Course course);

    //增加课程
    void addCourse(Course course);

    void editCourse(Course course);

    //删除课程
    void deleteCourse(List<Integer> ids);

    //判断课程是否已满
    boolean isFull(int course_id);

    //更新该课程的可选数量
    void updateCourseSelectedNum( int course_id );

    //更新该课程的可选数量减
    void updateCourseSelectedNumDe( int course_id );

}
