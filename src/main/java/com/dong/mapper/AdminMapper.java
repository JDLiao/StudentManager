package com.dong.mapper;

import com.dong.entity.Admin;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author dong
 * @create 2020-05-04 16:10
 */
@Mapper
public interface AdminMapper {

    Admin queryAdmin(@Param(value = "name") String name,@Param(value ="password" ) String password);

    int deleteUser(int id);

    int editPassword(@Param("admin") Admin admin,@Param("newPwd") String newPwd);
}
