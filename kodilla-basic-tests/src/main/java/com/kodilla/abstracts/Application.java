package com.kodilla.abstracts;

public class Application {
    public static void main(String[] args) {
//        Dog dog = new Dog();
//        dog.giveVoice();

        Animal duck = new Duck();
        duck.giveVoice();

        Animal dog = new Dog();
        dog.giveVoice();

        AnimalProcessor processor = new AnimalProcessor();
        processor.process(dog);
        processor.process(duck);

    }
}
