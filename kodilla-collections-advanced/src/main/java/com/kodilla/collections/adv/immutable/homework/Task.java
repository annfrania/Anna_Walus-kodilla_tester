package com.kodilla.collections.adv.immutable.homework;

public final class Task {
    protected final String title;
    protected final int duration;

    public Task(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", duration=" + duration +
                '}';
    }
}
