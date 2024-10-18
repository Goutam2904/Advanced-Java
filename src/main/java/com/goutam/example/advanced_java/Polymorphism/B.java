package com.goutam.example.advanced_java.Polymorphism;

public class B extends A{
    public void Hello() {
        System.out.println("Hello from B");
    }

    @Override
    public void Hello(String name) {
        System.out.println("Hello from B " + name);
    }
}
