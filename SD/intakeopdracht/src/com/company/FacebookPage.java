package com.company;

public class FacebookPage {

    private Student student;

public FacebookPage(Student student){
 this.student = student;
}

@Override
public String toString(){
   String info = "Hallo ik ben"+ student.getName() + "mijn leeftijd is"+ student.getAge();
   return info;

}
}
