package com.fun;
import java.text.SimpleDateFormat;
import java.util.*;
public class Execute {
    public static void main(String[] args) throws Exception {
      footballMatch ftb=new footballMatch();
      musicConcert msc=new musicConcert();
      Scanner input=new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name4=input.nextLine();
        System.out.println("Enter the date : ");
        String date6=input.nextLine();
        Date dt1=new SimpleDateFormat("dd/mm/yyyy").parse(date6);
        ftb.show(name4,dt1);
        msc.show(name4,dt1);


    }
}
