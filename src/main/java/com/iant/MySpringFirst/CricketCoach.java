package com.iant.MySpringFirst;

import org.springframework.stereotype.Component;

@Component
public class CricketCoach {
    public String getDailywork(){
        String msg="Cricket is our national game";
        return msg;
    }
}
