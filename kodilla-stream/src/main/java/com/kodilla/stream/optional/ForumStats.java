package com.kodilla.stream.optional;

import com.kodilla.stream.User;
import com.kodilla.stream.UsersRepository;

public class ForumStats {
    public static void main(String[] args) {
        double averageForOlder = UsersRepository.getUsersList()
                .stream()
                .filter(n -> n.getAge() >= 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .getAsDouble();
        System.out.println(averageForOlder);

        double averageForYounger = UsersRepository.getUsersList()
                .stream()
                .filter(n -> n.getAge() < 40)
                .mapToInt(User::getNumberOfPosts)
                .average()
                .getAsDouble();
        System.out.println(averageForYounger);
    }
}
