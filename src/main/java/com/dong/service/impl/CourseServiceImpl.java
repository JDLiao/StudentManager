package com.dong.service.impl;

import com.dong.entity.Course;
import com.dong.mapper.CourseMapper;
import com.dong.service.CourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dong
 * @create 2020-05-06 16:47
 */
@Service
@Slf4j
public class CourseServiceImpl implements CourseService {

    @Autowired(required = false)
    CourseMapper courseMapper;
    @Override
    public List<Course> getCourseList(Course course, int page, int limit) {
        return courseMapper.getCourseList(course,page,limit);
    }

    @Override
    public int getCourseListTotal(Course course) {
        return courseMapper.getCourseListTotal(course);
    }

    @Override
    public void addCourse(Course course) {
        courseMapper.addCourse(course);
    }

    @Override
    public void editCourse(Course course) {
        courseMapper.editCourse(course);
    }

    @Override
    public void deleteCourse(List<Integer> ids) {
        courseMapper.deleteCourse(ids);
    }

    @Override
    public boolean isFull(int course_id) {
        int num = courseMapper.isFull(course_id);
        return num==0?false:true;
    }

    @Override
    public void updateCourseSelectedNum(int course_id) {
        courseMapper.updateCourseSelectedNum(course_id);
    }

    @Override
    public void updateCourseSelectedNumDe(int course_id) {
        courseMapper.updateCourseSelectedNumDe(course_id);
    }
}
