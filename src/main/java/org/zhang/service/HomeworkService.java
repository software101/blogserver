package org.zhang.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.zhang.bean.Homework;
import org.zhang.mapper.HomeworkMapper;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by zhang on 2019/03/20.
 */
@Service
@Transactional
public class HomeworkService {

    @Autowired
    HomeworkMapper homeworkMapper;

    public int addNewHomework(Homework homework) {
        homework.setWorktime(new Timestamp(System.currentTimeMillis()));
        int i = homeworkMapper.addNewHomework(homework);
        return i;
    }

    public List<Homework> getHomework(Integer page, Integer count) {
        int start = (page - 1) * count;
        return homeworkMapper.getHomework(start,count);
    }

    public int getHomeworkCount() {
        return homeworkMapper.getHomeworkCount();
    }
}
