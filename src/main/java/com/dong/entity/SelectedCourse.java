package com.dong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dong
 * @create 2020-05-06 13:54
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SelectedCourse {

    private int id;
    private int student_id;
    private int teacher_id;
    private int course_id;
    private int score_id;
}
