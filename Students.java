package com.fun;

public class Students {
    String name_student;
    int roll_student;

    public Students(){

        name_student="";
        roll_student=0;
    }

    public Students(String name, int roll){

        this.name_student=name;
        this.roll_student=roll;
        System.out.println("The name of the student is :  "+name);
        System.out.println("The roll of the student is : "+roll);

    }
}
