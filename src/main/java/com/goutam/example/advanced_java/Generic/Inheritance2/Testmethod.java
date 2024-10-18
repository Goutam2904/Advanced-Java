package com.goutam.example.advanced_java.Generic.Inheritance2;

import java.util.List;

public class Testmethod {

    public <T extends Animal> void printanimal(List<T> animal){
        for (T a : animal){
            System.out.println(a);
        }
    }
    public void printanimal2(List<? extends Animal> animal){
        for (Animal a : animal){
            System.out.println(a);
        }
    }
    public void printanimal3(List<?> animal){

    }
}
