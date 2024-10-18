package com.goutam.example.advanced_java.Abstract;

public class Client {
    public static void main(String[] args) {
        Abstract_class a = new Abstract_class() {
            @Override
            void eat() {
                System.out.println("eat");
            }
        };
        a.print("Hello");
        a.eat();
    }
}
