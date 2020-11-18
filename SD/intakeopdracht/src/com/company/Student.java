package com.company;

public class Student {

 private String name;
 private int age;
 private int studentId;
 private  String favCourse;

    Student(String name,int age, int studentId, String favCourse){
        this.name = name;
        this.age = age;
        this.studentId = studentId;
        this.favCourse = favCourse;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFavCourse() {
        return favCourse;
    }

    public void setFavCourse(String favCourse) {
        this.favCourse = favCourse;
    }
}

