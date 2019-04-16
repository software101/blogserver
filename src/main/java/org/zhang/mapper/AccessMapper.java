package org.zhang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.zhang.bean.Homework;

import java.util.List;

/**
 * Created by zhang on 2019/03/20.
 */
@Mapper
public interface AccessMapper {

    int addNewHomework(Homework homework);

    int getHomeworkCount();

    List<Homework> getHomework(@Param("start") Integer start, @Param("count") Integer count);
}
