package interfaces.homework;

public class Ferrari implements Car {
private int speed;

    public Ferrari(int speed){
        this.speed = speed;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
    speed = speed + 20;
    }

    @Override
    public void decreaseSpeed() {
    speed = speed - 10;
    }
}
