package com.dong.service;

import com.dong.entity.Student;
import com.dong.entity.Test;

/**
 * @author dong
 * @create 2020-05-05 19:44
 */
public interface TestService {
    Test queryStudentTest(String name, String password);

}
