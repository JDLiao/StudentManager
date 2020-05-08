package com.dong.service;

import com.dong.entity.Admin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

/**
 * @author dong
 * @create 2020-05-04 21:10
 */

public interface AdminService {

    Admin queryAdmin(String name, String password);

    void editPassword(Admin admin,String newPwd);

}
