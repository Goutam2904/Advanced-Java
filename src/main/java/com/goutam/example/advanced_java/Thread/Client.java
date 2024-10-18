package com.goutam.example.advanced_java.Thread;

public class Client {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName());
        print();
    }
    public static void print() {
        System.out.println(Thread.currentThread().getName());
    }
}
