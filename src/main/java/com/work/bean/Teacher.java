package com.work.bean;

import java.util.List;

/**
 * Created by Peacoke on 2021/7/16.
 */
public class Teacher {

    private String tid;
    private String tname;

    private List<Course> courseList;


    public String getTid() {
        return tid;
    }

    public void setTid(String tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    public void setCourseList(List<Course> courseList) {
        this.courseList = courseList;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid='" + tid + '\'' +
                ", tname='" + tname + '\'' +
                ", courseList=" + courseList +
                '}';
    }
}
