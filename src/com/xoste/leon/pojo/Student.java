package com.xoste.leon.pojo;

public class Student {
    private int sid;
    private String sname;
    private int sage;
    private int tid;
    private Teacher teacher;

    public Student() {
    }

    public Student(int sid, String sname, int sage, int tid, Teacher teacher) {
        this.sid = sid;
        this.sname = sname;
        this.sage = sage;
        this.tid = tid;
        this.teacher = teacher;
    }

    public int getSid() {
        return sid;
    }

    public void setSid(int sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public int getSage() {
        return sage;
    }

    public void setSage(int sage) {
        this.sage = sage;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", sname='" + sname + '\'' +
                ", sage=" + sage +
                ", tid=" + tid +
                ", teacher=" + teacher +
                '}';
    }
}
