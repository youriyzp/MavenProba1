package net.ukr.kiyashko.rally;

public class Car {
    private String name;
    private int maxSpeed;

    public Car(String name, int maxSpeed) {
        this.name = name;
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public String getName() {
        return name;
    }
}
