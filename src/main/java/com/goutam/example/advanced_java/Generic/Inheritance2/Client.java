package com.goutam.example.advanced_java.Generic.Inheritance2;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Cat> cats = new ArrayList<>();
        List<Dog> dogs = new ArrayList<>();
        List<String> animalNames = new ArrayList<>();
        Testmethod testmethod = new Testmethod();

        testmethod.printanimal(dogs);
        testmethod.printanimal(cats);
        testmethod.printanimal(animals);
        //testmethod.printanimal(animalNames);

        testmethod.printanimal2(animals);
        testmethod.printanimal2(cats);
        testmethod.printanimal2(dogs);
        //testmethod.printanimal(animalNames);

        testmethod.printanimal3(animalNames);
        testmethod.printanimal3(animals);
        testmethod.printanimal3(dogs);
        testmethod.printanimal3(cats);
    }
}
