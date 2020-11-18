package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("Welkom bij dit script");


      Student anissa =  new Student("Anissa",24,178531,"DST");
      Student gianni = new Student("Gianni",18,80000,"PGB");




                School school = new School("hz");

                school.entrance(anissa);
                school.entrance(gianni);
                Console console = new Console();
               console.print(school.listStudentsPass());
    }


}



