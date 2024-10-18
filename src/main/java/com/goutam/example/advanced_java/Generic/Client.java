package com.goutam.example.advanced_java.Generic;

public class Client {
    public static void main(String[] args) {
        Pair<String,Integer> pair = new Pair<>("Goutam",20);


        System.out.println(pair.getFirst());
        System.out.println(pair.getSecond());
        System.out.println(pair.getName());

       String s= pair.doSomething("av");
    }
}
