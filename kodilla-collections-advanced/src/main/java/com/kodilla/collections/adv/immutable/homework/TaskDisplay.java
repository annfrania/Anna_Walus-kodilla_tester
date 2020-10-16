package com.kodilla.collections.adv.immutable.homework;

public class TaskDisplay {
    public static void main(String[] args) {
        Task task = new Task("planning", 90);
        Task task1 = new Task("programming",360);
//        task.getTitle();
//        task.getDuration();
        System.out.println(task);
        System.out.println(task1);
    }
}
