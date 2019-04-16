package org.zhang.bean;

import java.sql.Timestamp;

public class Homework {

    private Long id;
    private String title;
    private String content;
    private String point1;
    private Long num1;
    private String point2;
    private Long num2;
    private String point3;
    private Long num3;
    private String answer;
    private Timestamp worktime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPoint1() {
        return point1;
    }

    public void setPoint1(String point1) {
        this.point1 = point1;
    }

    public Long getNum1() {
        return num1;
    }

    public void setNum1(Long num1) {
        this.num1 = num1;
    }

    public String getPoint2() {
        return point2;
    }

    public void setPoint2(String point2) {
        this.point2 = point2;
    }

    public Long getNum2() {
        return num2;
    }

    public void setNum2(Long num2) {
        this.num2 = num2;
    }

    public String getPoint3() {
        return point3;
    }

    public void setPoint3(String point3) {
        this.point3 = point3;
    }

    public Long getNum3() {
        return num3;
    }

    public void setNum3(Long num3) {
        this.num3 = num3;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Timestamp getWorktime() {
        return worktime;
    }

    public void setWorktime(Timestamp worktime) {
        this.worktime = worktime;
    }
}
