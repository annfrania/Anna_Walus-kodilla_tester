package com.kodilla.stream.optional.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Application {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();

        studentList.add(new Student("Adam", new Teacher("Mr.Knopfler")));
        studentList.add(new Student("Sam",null));
        studentList.add(new Student("Lisa", new Teacher("Mrs.Doubtfire")));
        studentList.add(new Student("Victoria", new Teacher("Mrs.Smith")));


        for (Student students : studentList) {
            System.out.println("Uczeń " + students.getName() + " - " + "Nauczyciel " + Optional.ofNullable(students.getTeacher())
                    .map(Teacher::getName)
                    .orElse("<undefined>"));
        }

    }
}

