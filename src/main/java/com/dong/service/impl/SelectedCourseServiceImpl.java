package com.dong.service.impl;

import com.dong.entity.SelectedCourse;
import com.dong.mapper.SelectedCourseMapper;
import com.dong.service.SelectedCourseService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

/**
 * @author dong
 * @create 2020-05-06 14:01
 */
@Service
@Slf4j
public class SelectedCourseServiceImpl implements SelectedCourseService {

    @Autowired(required = false)
    SelectedCourseMapper selectedCourseMapper;

    @Override
    public List<SelectedCourse> getSelectedCourseList(SelectedCourse selectedCourse, int page, int limit) {
        return selectedCourseMapper.getSelectedCourseList(selectedCourse,page,limit);
    }

    @Override
    public int getSelectedCourseListTotal(SelectedCourse selectedCourse) {
        return selectedCourseMapper.getSelectedCourseListTotal(selectedCourse);
    }

    @Override
    public SelectedCourse getSelectedCourseById(int id) {
        return selectedCourseMapper.getSelectedCourseById(id);
    }

    @Override
    public boolean isSelected(int student_id, int course_id) {
        return selectedCourseMapper.isSelected(student_id,course_id) == 0?false:true;
    }

    @Override
    public void addSelectedCourse(SelectedCourse selectedCourse) {
        selectedCourseMapper.addSelectedCourse(selectedCourse);
    }

    @Override
    public void deleteSelectedCourse(List<Integer> ids) {
        selectedCourseMapper.deleteSelectedCourse(ids);
    }

    @Override
    public void deleteSelectedCourseById(int id) {

            selectedCourseMapper.deleteSelectedCourseById(id);


    }

    @Override
    public void editSelectedCourse(SelectedCourse selectedCourse) {
        selectedCourseMapper.editSelectedCourse(selectedCourse);
    }
}
