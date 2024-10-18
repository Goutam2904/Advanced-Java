package com.goutam.example.advanced_java.Synchronisation.Mutex;

import java.util.concurrent.locks.Lock;

public class Subtractor implements Runnable {
    private Count count;
    private Lock lock;
    public Subtractor(Count i, Lock lock) {
        count = i;
        this.lock = lock;
    }
    public void run() {
        for (int i = 0; i < 10000; i++) {
            lock.lock();
            count.value-=i;
            lock.unlock();
        }
    }
}
