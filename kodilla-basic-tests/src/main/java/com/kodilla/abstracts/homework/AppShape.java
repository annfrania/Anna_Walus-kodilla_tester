package com.kodilla.abstracts.homework;

public class AppShape {
    public static void main(String[] args) {
        Square square = new Square(4);
        square.getArea();
        square.getPerimeter();

        Circle circle = new Circle(5);
        circle.getArea();
        circle.getPerimeter();

        Triangle triangle = new Triangle(5, 3, 4, 2);
        triangle.getArea();
        triangle.getPerimeter();

        AppShape2 displayData = new AppShape2();//nowy obiekt "displayData" z klasy AppShape2 z metody display
        displayData.display(square);// wywołanie metody: obiekt.metoda(czego dotyczy-wczesniejsze obiekty)
        displayData.display(circle);
        displayData.display(triangle);

    }
}
