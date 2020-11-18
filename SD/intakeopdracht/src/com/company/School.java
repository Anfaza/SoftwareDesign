package com.company;

import java.util.ArrayList;

public class School {
    private ArrayList <Student>students;

    public ArrayList<Student> getStudents(){
        return students;
    }
    private String name;
    public String getName(){
        return name;
    }

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }
    public void entrance(Student student){
        this.students.add(student);

    }

    public String listStudentsPass(){
      StringBuilder builder = new StringBuilder();
      for(Student student:this.students){

          HzPas pas = new HzPas(student);
          String str = pas.toString();
          builder.append(str);

      }
    return builder.toString();
    }
}
