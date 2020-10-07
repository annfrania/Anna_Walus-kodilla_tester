package interfaces.homework;

public class Toyota implements Car {
    int speed;

    public Toyota(int speed) {
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
    speed = speed + 12;
    }

    @Override
    public void decreaseSpeed() {
    speed = speed - 6;
    }
}
