package org.zhang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zhang.bean.Course;
import org.zhang.mapper.CourseMapper;

import java.util.List;

/**
 * Created by zhang on 2019/03/20.
 */
@Service
@Transactional
public class CourseService {

    @Autowired
    CourseMapper CourseMapper;
    
    public List<Course> getCourse() {
        return CourseMapper.getCourse();
    }
}
