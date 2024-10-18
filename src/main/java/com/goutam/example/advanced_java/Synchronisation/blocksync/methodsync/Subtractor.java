package com.goutam.example.advanced_java.Synchronisation.blocksync.methodsync;

public class Subtractor implements Runnable {
    private Count count;
    public Subtractor(Count i) {
        count = i;
    }
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (count) {
                count.increment(-i);
            }
        }
    }
}
