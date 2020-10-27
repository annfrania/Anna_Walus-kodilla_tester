package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static LocalDate currentDate = LocalDate.now();

    public static LocalDate getCurrentDate() {
        return currentDate;
    }

    public static void main(String[] args) {
        List<LocalDate> lefttasks = TaskRepository.getTasks()
                .stream()
                .filter(t -> t.getDeadline().isBefore(getCurrentDate()))
                .map(TaskManager :: getDeadline)
                .collect(Collectors.toList());
        System.out.println(lefttasks);
    }
    public static LocalDate getDeadline (LocalDate deadline){
        return deadline;
    }
}
