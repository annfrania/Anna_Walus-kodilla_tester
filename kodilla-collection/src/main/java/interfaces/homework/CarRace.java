package interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Toyota toyota = new Toyota(70);
        doRace(toyota);

        Ford ford = new Ford(70);
        doRace(ford);

        Ferrari ferrari = new Ferrari(70);
        doRace(ferrari);
    }
    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        car.getSpeed();
        System.out.println(car.getSpeed());
    }
}
