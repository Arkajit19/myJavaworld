package com.fun;

import java.util.Date;

public class footballMatch extends Event {

    public void show(String name1, Date date1){

        this.name_cand=name1;
        this.date_event=date1;
        System.out.println("The name of the candidate is : "+name1);
        System.out.println("The date of the footballmatch is :"+date1);
    }

}
