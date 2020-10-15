package lists.homework;

import interfaces.homework.Car;
import interfaces.homework.Toyota;

import java.util.ArrayList;
import java.util.List;

public class CarListApplication {
    public static void main(String[] args) {
        List<Toyota> cars = new ArrayList<>();

        Toyota toyota = new Toyota(65);
        cars.add(toyota);

        cars.add(new Toyota(140));
        cars.add(new Toyota(78));
        cars.add(new Toyota(120));

        cars.remove(2);
        cars.remove(toyota);


        System.out.println(cars.size());

        for (Toyota car : cars) {
            System.out.println(car);
        }

    }
}
