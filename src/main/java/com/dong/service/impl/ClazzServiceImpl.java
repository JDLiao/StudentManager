package com.dong.service.impl;

import com.dong.entity.Clazz;
import com.dong.mapper.ClazzMapper;
import com.dong.service.ClazzService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author dong
 * @create 2020-05-05 15:19
 */
@Service
@Slf4j
public class ClazzServiceImpl implements ClazzService {

    @Autowired(required = false)
    ClazzMapper clazzMapper;
    @Override
    public List<Clazz> getClazzList(Clazz clazz, int page, int limit) {
        return clazzMapper.getClazzList(clazz,page,limit);

    }

    @Override
    public int getClazzListTotal(Clazz clazz) {
        return clazzMapper.getClazzListTotal(clazz);
    }

    @Override
    public void editClazz(Clazz clazz) {
        try {
            clazzMapper.editClazz(clazz);
        } catch (Exception e) {
            e.printStackTrace();
            log.error("更新班级失败, clazz:{}, cause:{}", clazz, e);
        }
    }

    @Override
    public void addClazz(Clazz clazz) {
        clazzMapper.addClazz(clazz);
    }

    @Override
    public void deleteClazzAll(List<Integer> ids) {
        clazzMapper.deleteClazzAll(ids);
    }

    @Override
    public void deleteClazz(int id) {
        clazzMapper.deleteClazz(id);
    }
}
