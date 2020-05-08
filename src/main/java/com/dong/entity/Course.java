package com.dong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dong
 * @create 2020-05-03 14:07
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Course {
    private int id;
    private String name;
    private int teacher_id;
    private String course_date;
    private  int selected_num = 0; //已选人数
    private  int max_num = 50;//课程选课的最大人数
    private String info;
}
