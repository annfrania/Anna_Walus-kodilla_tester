package interfaces.homework;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "Toyota{" +
                "speed=" + speed +
                '}';
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Toyota toyota = (Toyota) o;
        return speed == toyota.speed;
    }

    @Override
    public int hashCode() {
        return Objects.hash(speed);
    }
}
