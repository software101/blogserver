package org.zhang.bean;

import java.sql.Timestamp;
import java.util.List;

/**
 * Created by zhang on 2019/03/20.
 */
public class Course {
    private Long id;
    private String mon;
    private String tues;
    private String wed;
    private String thur;
    private String fri;
    private String sat;
    private String sun;
    private String student;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMon() {
        return mon;
    }

    public void setMon(String mon) {
        this.mon = mon;
    }

    public String getTues() {
        return tues;
    }

    public void setTues(String tues) {
        this.tues = tues;
    }

    public String getWed() {
        return wed;
    }

    public void setWed(String wed) {
        this.wed = wed;
    }

    public String getThur() {
        return thur;
    }

    public void setThur(String thur) {
        this.thur = thur;
    }

    public String getFri() {
        return fri;
    }

    public void setFri(String fri) {
        this.fri = fri;
    }

    public String getSat() {
        return sat;
    }

    public void setSat(String sat) {
        this.sat = sat;
    }

    public String getSun() {
        return sun;
    }

    public void setSun(String sun) {
        this.sun = sun;
    }

    public String getStudent() {
        return student;
    }

    public void setStudent(String student) {
        this.student = student;
    }
}
