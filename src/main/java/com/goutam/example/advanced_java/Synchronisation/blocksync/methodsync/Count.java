package com.goutam.example.advanced_java.Synchronisation.blocksync.methodsync;

public class Count {
    public int value = 0;

    public void increment(int i) {
        value += i;
    }

    public int getValue() {
        return value;
    }
}
