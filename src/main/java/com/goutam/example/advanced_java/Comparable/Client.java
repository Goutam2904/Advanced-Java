package com.goutam.example.advanced_java.Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Car car1 = new Car(75, 20);
        Car car2 = new Car(75, 28);
        Car car3 = new Car(105, 22);
        Car car4 = new Car(125, 90);

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);
        cars.add(car4);

        Collections.sort(cars);
        System.out.println(cars);

        Collections.sort(cars, new Powercompare());
        System.out.println(cars);








    }
}
