package com.goutam.example.advanced_java.Synchronisation.Mutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
            Count count = new Count();
            count.value=0;

            Lock lock = new ReentrantLock();
            Adder add = new Adder(count, lock);
            Subtractor subtractor = new Subtractor(count, lock);
            Thread thread = new Thread(add);
            Thread thread2 = new Thread(subtractor);
            thread.start();
            thread2.start();
            thread.join();
            thread2.join();

            System.out.println(count.value);
    }
    }

