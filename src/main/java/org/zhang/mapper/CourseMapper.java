package org.zhang.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.zhang.bean.Course;

import java.util.List;

/**
 * Created by zhang on 2019/03/20.
 */
@Mapper
public interface CourseMapper {

    List<Course> getCourse();
}
