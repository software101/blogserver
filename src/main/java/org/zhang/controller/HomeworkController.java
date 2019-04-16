package org.zhang.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.zhang.bean.Homework;
import org.zhang.bean.RespBean;
import org.zhang.service.HomeworkService;

import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhang on 2019/03/20.
 */
@RestController
@RequestMapping("/admin/homework")
public class HomeworkController {

    private SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd");

    @Autowired
    HomeworkService homeworkService;

    @RequestMapping(value = "/addNewWork", method = RequestMethod.POST)
    public RespBean addNewHomework(Homework homework) {
        int result = homeworkService.addNewHomework(homework);
        if (result == 1) {
            return new RespBean("success", "保存成功！");
        } else {
            return new RespBean("error","保存失败!");
        }
    }

    @RequestMapping(value = "/query", method = RequestMethod.GET)
    public Map<String, Object> getHomeworkByState( @RequestParam(value = "page", defaultValue = "1") Integer page, @RequestParam(value = "count", defaultValue = "6") Integer count) {
        int totalCount = homeworkService.getHomeworkCount();
        List<Homework> homeworks = homeworkService.getHomework(page, count);
        Map<String, Object> map = new HashMap<>();
        map.put("totalCount", totalCount);
        map.put("homeworks", homeworks);
        return map;
    }
}
