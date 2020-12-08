package com.kodilla.spring.basic.spring_scopes.homework;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.LocalTime;

@Component
@Scope("prototype")
public class Clock {
LocalTime now = LocalTime.now();

    public Clock (){//bez argumentów
        System.out.println("Creating new time bean:" + now);
    }
}
