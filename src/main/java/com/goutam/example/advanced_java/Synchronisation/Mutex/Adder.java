package com.goutam.example.advanced_java.Synchronisation.Mutex;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
      Count count;
      Lock lock;
    public Adder(Count i, Lock lock) {
        count = i;
        this.lock = lock;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            lock.lock();
           count.value+=i;
           lock.unlock();
        }
    }
}
