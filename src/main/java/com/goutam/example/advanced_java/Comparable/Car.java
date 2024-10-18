package com.goutam.example.advanced_java.Comparable;

public class Car implements Comparable<Car>{
    public int speed;
    public int power;
    public Car(int speed, int power) {
        this.speed = speed;
        this.power = power;
    }

    @Override
    public int compareTo(Car o) {
        return 0;
    }

    @Override
    public String toString() {
        return "Car [speed=" + speed + ", power=" + power + "]";
    }
}
