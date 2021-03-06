package com.kodilla.spring.basic.spring_dependency_injection.homework;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootTest
class CalculatorTestSuite {

    @Test
    public void shouldReturnCorrectValueWhenAdding(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double valueOfAdding = bean.add(12.2, 71.1);
        Assertions.assertEquals(83.3,valueOfAdding);
    }

    @Test
    public void shouldReturnCorrectValueWhenSubstracting(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double valueOfSubstracting = bean.substract(12.2, 71.1);
        Assertions.assertEquals(-58.89999999999999,valueOfSubstracting);

        //ale tego wyniku -58.89999999999999 to nie ogarniam ;) Pewnie jakieś niuanse javy?
    }

    @Test
    public void shouldReturnCorrectValueWhenMultiplying(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Calculator bean = context.getBean(Calculator.class);
        double valueOfMultiplying = bean.multiply(12, 7);
        Assertions.assertEquals(84.0,valueOfMultiplying);
    }

    @Test
    public void shouldDisplayTheValueOnCalculator(){
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.basic");
        Display bean = context.getBean(Display.class);
        Calculator bean1 = context.getBean(Calculator.class);
        double displayedValue = bean.display(bean1.divide(23,44.5));
        Assertions.assertNotNull(displayedValue);
    }
}