package com.example.demo.freemarkerTest.entity;

import java.util.List;

/**
 * Created by lk on 2018/10/18.
 */
public class Class {
    String name;
    List<Student> studentList;

    public Class() {
    }

    public Class(String name, List<Student> studentList) {
        this.name = name;
        this.studentList = studentList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
