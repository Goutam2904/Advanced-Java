package com.goutam.example.advanced_java.Thread.Threadtest;

public class Hello_World implements Runnable{
    public void print() {
        System.out.println("Hello_World");
    }

    @Override
    public void run() {
        System.out.println("Hello_World");
    }
}
