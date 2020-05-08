package com.dong.service;

import com.dong.entity.Clazz;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author dong
 * @create 2020-05-05 15:18
 */
public interface ClazzService {

    List<Clazz> getClazzList(Clazz clazz,  int page, int limit);

    //查询班级总数
    int getClazzListTotal(Clazz clazz);

    //修改班级
    void editClazz(Clazz clazz);

    //插入班级
    void addClazz(Clazz clazz);

    //批量删除班级
    void deleteClazzAll( List<Integer> ids);

    //删除单个班级
    void deleteClazz(int id);


}
