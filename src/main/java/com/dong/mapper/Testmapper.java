package com.dong.mapper;

import com.dong.entity.Student;
import com.dong.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author dong
 * @create 2020-05-05 19:42
 */
@Mapper
public interface Testmapper {
    Test queryStudentTest(@Param(value = "name") String name, @Param(value = "password") String password);

}
