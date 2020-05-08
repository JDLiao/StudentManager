package com.dong.service.impl;

import com.dong.entity.Test;
import com.dong.mapper.Testmapper;
import com.dong.service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author dong
 * @create 2020-05-05 19:45
 */
@Service
@Slf4j
public class TestServiceImpl implements TestService {

    @Autowired(required = false)
    Testmapper testmapper;

    @Override
    public Test queryStudentTest(String name, String password) {
        return testmapper.queryStudentTest(name,password);
    }
}
