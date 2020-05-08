package com.dong.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author dong
 * @create 2020-05-05 19:40
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Test {
    private  int id;
    private String sn;
    private String name;
    private String password;
    private int CLAZZID;
    private String sex;
    private String mobile;
    private String qq;
}
