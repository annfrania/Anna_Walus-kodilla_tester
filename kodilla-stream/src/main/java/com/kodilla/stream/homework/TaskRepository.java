package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    public static LocalDate myDate = LocalDate.of(2020,12,01);


    public LocalDate getMyDate() {
        return myDate;
    }

    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("fix the bike",LocalDate.of(2020,8,10),LocalDate.of(2020,9,30)));
        tasks.add(new Task("read a trilogy",LocalDate.of(2021,1,1),LocalDate.of(2021,3,31)));
        tasks.add(new Task("exercise for health",LocalDate.of(2020,7,1),TaskRepository.myDate));

        return tasks;
    }
}
