package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ShippingCenterTestSuite {

    @Test
    public void shouldReturnInfoWhenDelivered(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean2 = context.getBean(NotificationService.class);
        String infoDelivered = bean2.success("someAddress");
        Assertions.assertEquals("Package delivered to: someAddress",infoDelivered);
    }
    @Test
    public void shouldReturnInfoWhenNotDelivered(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        NotificationService bean = context.getBean(NotificationService.class);
        String infoDelivered = bean.fail("someAddress");
        Assertions.assertEquals("Package not delivered to: someAddress",infoDelivered);
    }
    @Test
    public void shouldReturnCorrectTrueOrFalse(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        DeliveryService bean = context.getBean(DeliveryService.class);
        Boolean infoDelivered = bean.deliverPackage  ("someAddress",12);
        Assertions.assertTrue(infoDelivered);
    }
    @Test
    public void shouldReturnCompleteInfoWhenDelivered(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        ShippingCenter bean = context.getBean(ShippingCenter.class);
        String infoDelivered = bean.sendPackage("someAddress",15);
        Assertions.assertEquals("Package delivered to: someAddress",infoDelivered);
    }

}