package com.xoste.leon.pojo;

import java.util.List;

public class Teacher {
    private int tid;
    private String tname;
    private List<Student> listStudent;

    public Teacher() {
    }

    public Teacher(int tid, String tname, List<Student> listStudent) {
        this.tid = tid;
        this.tname = tname;
        this.listStudent = listStudent;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getTname() {
        return tname;
    }

    public void setTname(String tname) {
        this.tname = tname;
    }

    public List<Student> getListStudent() {
        return listStudent;
    }

    public void setListStudent(List<Student> listStudent) {
        this.listStudent = listStudent;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "tid=" + tid +
                ", tname='" + tname + '\'' +
                ", listStudent=" + listStudent +
                '}';
    }
}
