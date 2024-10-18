package com.goutam.example.advanced_java.Synchronisation.ProducerConsumer;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class Producer implements Runnable {
    private Queue<Object> queue;

    public Producer(Queue<Object> queue) {
        this.queue = queue;
    }

    @Override
    public void run() {
        while (true) {
            if (queue.size() < 6) {
               queue.add(new Object());
            }
        }

    }
}

