package com.company;

public class HzPas {
    private Student student;
    public HzPas(Student student){
        this.student = student;
    }
    @Override
    public String toString(){
        String message = "Jouw studentnummber is" +this.student.getStudentId();
        return message;
    }
}
