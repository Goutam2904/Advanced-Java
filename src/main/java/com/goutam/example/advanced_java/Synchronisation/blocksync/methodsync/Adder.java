package com.goutam.example.advanced_java.Synchronisation.blocksync.methodsync;

public class Adder implements Runnable {
      Count count;
    public Adder(Count i) {
        count = i;
    }
    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (count) {
                count.increment(i);
            }
        }
    }
}
