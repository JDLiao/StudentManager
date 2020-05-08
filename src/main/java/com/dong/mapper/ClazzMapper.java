package com.dong.mapper;

import com.dong.entity.Clazz;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author dong
 * @create 2020-05-05 14:58
 */
@Mapper
public interface ClazzMapper {

    //查询班级列表
    List<Clazz> getClazzList(@Param("clazz1") Clazz clazz, @Param("page") int page,@Param("limit") int limit);

    //查询班级总数
    int getClazzListTotal(Clazz clazz);

    //修改班级
    int editClazz(Clazz clazz);

    //插入班级
    int addClazz(Clazz clazz);

    //批量删除班级
    int deleteClazzAll(@Param("ids") List<Integer> ids);

    //删除单个班级
    int deleteClazz(int id);
}
