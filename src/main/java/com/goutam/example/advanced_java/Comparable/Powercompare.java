package com.goutam.example.advanced_java.Comparable;

import java.util.Comparator;

public class Powercompare implements Comparator<Car> {
    @Override
    public int compare(Car o1, Car o2) {
       return o1.power - o2.power;
    }
}
