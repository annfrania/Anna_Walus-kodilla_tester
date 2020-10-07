package com.kodilla.bacis_assertion;

public class Application {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.add(a,b);//wywołanie metody i przypisanie jej wyniku do zmiennej
        boolean correct = ResultChecker.assertEquals(13,sumResult);
        if (correct) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subResult = calculator.sub(a,b);
        boolean correct2 = ResultChecker.assertEquals(-3,subResult);
        if (correct2) {
            System.out.println("Metoda sub działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sub nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int squareResult = calculator.square(a);
        boolean correct3 = ResultChecker.assertEquals(25,squareResult);
        if (correct3) {
            System.out.println("Metoda square działa poprawnie dla liczby " + a );
        } else {
            System.out.println("Metoda square nie działa poprawnie dla liczby " + a );
        }
    }

}
