package com.dong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dong
 * @create 2020-05-03 14:13
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Student {
    private  int id;
    private String sn;
    private String name;
    private String password;
    private int clazz_id;
    private String sex;
    private String mobile;
    private String qq;
}
