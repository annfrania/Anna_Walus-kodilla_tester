package com.kodilla.stream.optional;

import com.kodilla.stream.User;

import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {
        User user = new User("bo",0,20,"some");

        Optional<User> optionalUser = Optional.ofNullable(user);

        optionalUser.ifPresent(u -> System.out.println(u.getUserName()));

        //String userName = optionalUser.orElse(new User("Bill",30,3,"noth")).getUserName();

        //System.out.println(userName);
    }
}
