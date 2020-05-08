package com.dong.service.impl;

import com.dong.entity.Admin;
import com.dong.mapper.AdminMapper;
import com.dong.service.AdminService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dong
 * @create 2020-05-04 21:11
 */
@Service
@Slf4j
public class AdminServiceImpl implements AdminService {

    @Autowired(required = false)
    AdminMapper adminMapper;

    @Override
    public Admin queryAdmin(String name, String password) { return adminMapper.queryAdmin(name,password); }

    @Override
    public void editPassword(Admin admin, String newPwd) {
        adminMapper.editPassword(admin,newPwd);
    }
}
