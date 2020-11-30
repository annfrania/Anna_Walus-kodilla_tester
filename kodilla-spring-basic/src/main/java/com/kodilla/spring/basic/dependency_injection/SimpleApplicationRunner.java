package com.kodilla.spring.basic.dependency_injection;

public class SimpleApplicationRunner {

    public static void main(String[] args) {
        MessageService messageService = new FacebookMessageService();
        SimpleApp application = new SimpleApp(messageService);
        application.processMessage("Test message", "receiver@mail.com");
    }
}
