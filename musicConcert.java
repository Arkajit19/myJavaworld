package com.fun;

import java.util.Date;

public class musicConcert extends Event {

    public void show(String name2, Date date2){

        this.name_cand=name2;
        this.date_event=date2;
        System.out.println("The name of the candidate is : "+name2);
        System.out.println("The date of the musicConsert is : "+date2);
    }
}
